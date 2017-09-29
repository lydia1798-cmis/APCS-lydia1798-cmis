import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Michael extends Robot
{
    public Michael(){
        super(Color.green);
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
        int moves = 0;
        boolean wentUp = false;
        int backTracking = 0;
        while (moves < 300) {
            if (backTracking == 0) {

                if (isClearRight()) {
                    right();
                }
                else if (isClearUp()) {
                    up();
                    backTracking = 5;
                }
                else if (isClearDown()) {
                    down();
                    backTracking = 5;
                }
                else{
                    left();
                    backTracking = 5;
                }
            }
            else {

                if (backTracking != 1) {
                    left();
                }
                
                else if (backTracking == 2) {
                    down();
                }

                else {
                    if (wentUp) {
                        down();
                    }

                    else {
                        up();
                    }
                    wentUp = !wentUp;

                }
                backTracking -= 1;
            }
            moves += 1;
        }
    }
}

