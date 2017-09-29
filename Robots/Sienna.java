import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Sienna extends Robot
{
    public Sienna(){
        super(Color.pink);
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
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        
        
        if (isClearRight() == true) {right();}
        
        if(isClearRight() == false) {
            
        left();
    }
        if (isClearLeft() == true) {
        down();
        }
        if (isClearDown() == true) {
        left();
        }
        }
        
    }