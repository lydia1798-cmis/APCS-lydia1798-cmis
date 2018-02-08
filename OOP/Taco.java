public class Taco
{
    private String topping1;
    private String topping2;
    private boolean isgood;
    private int length;
    private double height;
    private String eater;
    
    public static String[] salsaType = new String[]{"Spicy salsa", "mild salsa", "chill salsa", "this isn't salsa"};
    
    public Taco(){
        this.topping1 = salsaType[(int) Math.random() * 3];
        this.topping2 = "CHEESE";
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
    
    //Getters and Setter
    public String getTopping1(){
        return this.topping1;
    }
    
    public void setTopping1(String newTopping1){
        this.topping1 = newTopping1;
    }
    
    public String getTopping2(){
        return this.topping2;
    }
    
    public void setTopping2(String newTopping2){
        this.topping2 = newTopping2;
    }
    
    public boolean getIsGood(){
        return this.isgood;
    }
    
    public void setIsGood(boolean isGood){
        this.isgood = isGood;
    }
    
    //Accesors and Mutators
    public boolean healthy(String topping1, String topping2){
        if(topping1.equals("CHEESE") || topping2.equals("CHEESE")){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void combineToppings(String foodAdj, String topping1){
        this.topping1 = foodAdj + topping1;
    }
}
