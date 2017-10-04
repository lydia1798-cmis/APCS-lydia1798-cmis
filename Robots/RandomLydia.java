import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class RandomLydia extends Robot
{
    public RandomLydia(){
        super(Color.gray);
    }
    
    public void init(){
        
    }
    
    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     */
    public void behave(){
        double randomNumber = Math.random();
        double percent = randomNumber/0.25;
        if(percent <= 0.25){
            up();
        }
        else if(percent <= 0.50 && percent > 0.25){
            down();
        }
        else if(percent <= 0.95 && percent > 0.50){
            right();
        }
        else if(percent <= 1 && percent > 0.95){
            left();
        }
        
    }
}
