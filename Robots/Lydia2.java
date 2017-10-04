import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Lydia2 extends Robot
{
    public Lydia2(){
        super(Color.blue);
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
        
         if(isClearUp() == true && getX() % 2 != 0){
            up();
        }
        else if(isClearUp() == false && getX() % 2 != 0){
            right();
        }
        else if(getX() % 2 == 0 && isClearDown() == true){
            down();
        }
        else if(getX() % 2 == 0 && isClearDown() == false){
            right();
        }
        
    }
}
