import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Peter1 extends Robot
{
    public Peter1(){
        super(Color.red);
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
        int stopcount = 0;
        if(isClearRight()== false){
            if(isClearUp()== false){
                down();
            } else{
                up();
            }
        }
        else if(isClearRight()== true){
            right();
        }
        else if(isClearUp()&&isClearDown()== false){
            left();
            stopcount += 1;
            if (stopcount%2 !=0){
                stopcount +=1;
                down();
            }

        }
        else if(isClearUp()&&isClearRight()== false){
            stopcount +=1;
            left();           
        }
    }
}