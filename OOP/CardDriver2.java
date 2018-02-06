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
        System.out.println("Score: " + OneCardScore(Dealer[0].rank, Dealer[1].rank));
        int DealerScore = OneCardScore(Dealer[0].rank, Dealer[1].rank);
        
        System.out.println("\n");
        System.out.println("Player1:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player1[i]);
        }
        System.out.println("Score: " + OneCardScore(Player1[0].rank, Player1[1].rank));
        int Player1Score = OneCardScore(Player1[0].rank, Player1[1].rank);
        System.out.println(Winner(DealerScore, Player1Score, "Player1"));
        System.out.println("\n");
        System.out.println("Player2:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player2[i]);
        }
        System.out.println("Score: " + OneCardScore(Player2[0].rank, Player2[1].rank));
        int Player2Score = OneCardScore(Player2[0].rank, Player2[1].rank);
        System.out.println(Winner(DealerScore, Player2Score, "Player2"));
        System.out.println("\n");
        System.out.println("Player3:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player3[i]);
        }
        System.out.println("Score: " + OneCardScore(Player3[0].rank, Player3[1].rank));
        int Player3Score = OneCardScore(Player3[0].rank, Player3[1].rank);
        System.out.println(Winner(DealerScore, Player3Score, "Player3"));
        System.out.println("\n");
        System.out.println("Player4:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player4[i]);
        }
        System.out.println("Score: " + OneCardScore(Player4[0].rank, Player4[1].rank));
        int Player4Score = OneCardScore(Player4[0].rank, Player4[1].rank);
        System.out.println(Winner(DealerScore, Player4Score, "Player4"));
        System.out.println("\n");
        System.out.println("Player5:");
        for(int i = 0; i < 2; i++){
            System.out.println(Player5[i]);
        }
        System.out.println("Score: " + OneCardScore(Player5[0].rank, Player5[1].rank));
        int Player5Score = OneCardScore(Player5[0].rank, Player5[1].rank);
        System.out.println(Winner(DealerScore, Player5Score, "Player5"));                
    }

    //Calculate Total Score
    public static int OneCardScore(String randomRank1, String randomRank2){
        //whether or not it's an int
        int intRank1 = 0;
        for(int rankNum = 2; rankNum < 11; rankNum++){           
            if(randomRank1.equals("Ace")){
                intRank1 = 11;
            }
            else if(randomRank1.equals(String.valueOf(rankNum))){
                intRank1 = rankNum;
            }
            else if(randomRank1.equals("Jack") || randomRank1.equals("Queen") || randomRank1.equals("King")){
                intRank1 = 10;
            }
        }
        int intRank2 = 0;
        for(int rankNum = 2; rankNum < 11; rankNum++){
            if(randomRank2.equals("Ace")){
                intRank2 = 1;
            }
            else if(randomRank2.equals(String.valueOf(rankNum))){
                intRank2 = rankNum;
            }
            else if(randomRank2.equals("Jack") || randomRank2.equals("Queen") || randomRank2.equals("King")){
                intRank2 = 10;
            }
        }
        int totalScore = intRank1 + intRank2;
        return totalScore;
    }

    //Compare total scores and decide winner (playing against the Dealer)
    public static String Winner(int Dealer, int player, String playername){
        String out = "";
        if(Dealer == 21 && player == 21){
            out += "The Dealer won!";
        }
        else if(Dealer > player){
            out += "The Dealer won!";            
        }
        else if(Dealer < player){
            out += "The " + playername + " won!";
        }
        else if(Dealer == player){
            out += "The Dealer won!";
        }
        return out;
    }
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