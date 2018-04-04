import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Shrew extends Animal
{        
    private int nutrition = 100;
    public boolean eat(Actor food){
        boolean success = false;
        GreenfootImage img = getImage();
        
        if(food instanceof Banana){
            Banana banana = (Banana) food;
            int nutrition = banana.getNutrition();
            success = true;                
            while ( nutrition > 0){
                incrementLifeForce();
                img.scale(100, 100);
                nutrition--;
            }
        } else if (food instanceof Cherry){
            while(Math.random() > 0.5){
                whither();
            }
            success = true;
        }
        if(food instanceof Starfish){
            Starfish starfish = (Starfish) food;
            int nutrition = starfish.getLifeForce();
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                img.scale(1, 1);
                nutrition--;
            }
        } else if (food instanceof Cherry){
            while(Math.random() > 0.5){
                whither();
            }
            success = true;
        }
        return success;

    }

    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
    }

    public void reproduce(){
        if(isTouching(Shrew.class) && getLifeForce() > 95){
            World w = getWorld();
            w.addObject(new Shrew(), getX(), getY()); 
            w.removeObject(this);
        }
    }

}
