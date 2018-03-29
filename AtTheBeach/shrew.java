import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class shrew extends Animal
{        
    private int nutrition = 100;
    public boolean eat(Actor food){
            boolean success = false;
            if(food instanceof Banana){
                Banana banana = (Banana) food;
                int nutrition = banana.getNutrition();
                success = true;
                while ( nutrition > 0){
                    incrementLifeForce();
                    nutrition--;
                }
            } else if (food instanceof Cherry){
                while(Math.random() > 0.01){
                    whither();
                }
                success = true;
            }
            return success;
        
    }

    public void changePosition(){
        if(nutrition > 50){        
            turn(360);
        }
        else{
            turn(25);
        }
    }

    public void reproduce(){
        if(isTouching(Starfish.class) || getLifeForce() > 10){
            World w = getWorld();
            w.addObject(new shrew(), getX(), getY());            
        }
    }

}
