public class CardDriver2
{
    public static void main(){
        //6 Arrays of 2 Cards
        Card[] Dealer = new Card[2]; 
                for(int i = 0; i < 2; i++){
            Dealer[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        Card[] Player1 = new Card[2];
                for(int i = 0; i < 2; i++){
            Player1[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        Card[] Player2 = new Card[2];
                for(int i = 0; i < 2; i++){
            Player2[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        Card[] Player3 = new Card[2];
                for(int i = 0; i < 2; i++){
            Player3[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        Card[] Player4 = new Card[2];
                for(int i = 0; i < 2; i++){
            Player4[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        Card[] Player5 = new Card[2];
                for(int i = 0; i < 2; i++){
            Player5[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        
        //Print
        System.out.println("Dealer:");
        for(int i = 0; i < 2; i++){
            System.out.println(Dealer[i]);
        }
        System.out.println("\n");
        System.out.println("Player1:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player1[i]);
        }
        System.out.println("\n");
        System.out.println("Player2:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player2[i]);
        }
        System.out.println("\n");
        System.out.println("Player3:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player3[i]);
        }
        System.out.println("\n");
        System.out.println("Player4:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player4[i]);
        }
        System.out.println("\n");
        System.out.println("Player5:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player5[i]);
        }
        System.out.println("\n");
    }
    
    //Calculate Total Score
    public static int totalScore(String randomRank, String randomsuit){
        
    }
    
    //Compare total scores and decide winner
    
    //Random Card generator
    public static String randomRank(){
        String[] ranrank = new String[]
            {"2","3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};
        int randomi = (int) Math.floor(Math.random() * 12);        
        String yourRank = ranrank[randomi];
        return yourRank;
    }

    public static String randomSuit(){
        String[] ransuit = new String[]
            {"Clubs", "Spades", "Diamonds", "Hearts"};
        int randomi = (int) Math.floor(Math.random() * 3);
        String yourSuit = ransuit[randomi];
        return yourSuit;
    }
}