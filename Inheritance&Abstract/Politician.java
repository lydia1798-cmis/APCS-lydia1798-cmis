
public class Politician extends Person
{   
    private boolean isCorrupt;
    public Politician(String name, boolean isCorrupt){
        super(name);
        this.isCorrupt = isCorrupt;
    }
    
    public boolean eat(String food){
        boolean success = false;
        if(food.equals("carrots")){
            setLifeForce(2000.3);
            success = true;
        }
        else{
            setLifeForce(0.2);
        }
        return success;
    }
}
