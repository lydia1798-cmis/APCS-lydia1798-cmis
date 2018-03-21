public abstract class Person
{
    private String name = "Lydia the Great";
    private double lifeForce;
    private int x;
    private int y;
    public Person(String name){
        this.name = name;
        this.lifeForce = Math.random();
        this.x = 0;
        this.y = 0;
    }
    
    public abstract boolean eat(String food);
    
    public double getLifeForce(){
        return lifeForce;
    }
    
    public void setLifeForce(double newLifeForce){
        this.lifeForce = newLifeForce;
    }
    
     public boolean move(int dx, int dy){
        this.x += dx;
        this.y += dy;
        return true;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String toString(){
        String out = "";
        out += "I am a Person. My name is " + this.name + ".\n";
        out += "This is where I am: " + x + ", " + y + "\n";
        return out;
    }
}
