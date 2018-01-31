public class Taco
{
    private String topping1;
    private String topping2;
    private boolean isgood;
    
    public Taco(){
        this.topping1 = "cheese";
        this.topping2 = "salsa";
        this.isgood = true;
    }
    
    public Taco(String topping1, String topping2, boolean isgood){
        this.topping1 = "extra " + topping1;
        this.topping2 = "extra " + topping2;
        this.isgood = isgood;
    }
    
    public String toString(){
        String out = "";
        out += "This taco is decked out with\n" + topping1;
        out += " and " + topping2;
        if(isgood == true){
            out += " and is amazing.\n";
        }
        else{
            out += " and could use serious improvement.\n";
        }
        return out;
    }
}
