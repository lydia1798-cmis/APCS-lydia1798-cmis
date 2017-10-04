import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Lydia4 extends Robot
{
    public Lydia4(){
        super(new Color(115, 217, 219));
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
        if(isClearUp() == true
        else if(isClearRight() == true && getY() % 2 == 0){
            right();
        }
        else if(isClearDown() == true && getY() % 2 != 0){
            down();
        }
        else if(isClearDown() == true && getY() % 2 == 0){
            down();
        }
        
    }
}
