public class Card
{
    public String rank;
    public String suit;
    private int cardNum;
    
    public Card(){
        this.rank = "Ace";
        this.suit = "Diamonds";
        this.cardNum = 1;
    }
    
    public Card(String rank, String suit, int cardNum){
        this.rank = rank;
        this.suit = suit;
        this.cardNum = cardNum;
    }
    
    public String toString(){
        String out = "";
        out += "#" + cardNum + ": ";
        out += "The " + rank + " of " + suit;
        return out;
    }
}
