public class CardDriver
{
    public static void main(){        
        Card[] myHand = new Card[3];
        for(int i = 0; i < 3; i++){
            myHand[i] = new Card(randomRank(), randomSuit(), i + 1);
        }
        //print the array
        for(int i = 0; i < 3; i++){
            System.out.println(myHand[i]);
        }
    }

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
 