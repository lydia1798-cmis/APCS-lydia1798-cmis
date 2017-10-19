
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class harryPotter extends Robot
{
    public harryPotter(){
        super(Color.magenta);
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
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        locateRoom();
    }

    public void locateRoom(){
        //sub-problem #1: Locating the room
        //Geting to the top corner
        int heightOfBox = 0;

        if(getData(0) == 0){
            if(isClearUp() == true){
                //index 0 = true or false for up
                up();
            }
            if(isClearLeft() == true){
                left();
            }
            if(isClearLeft() == false && isClearUp() == false){
                setData(0, 1);
            }
        }
        //Counting height
        if(getData(1) == 0){ 
            if(isClearDown() == true && getData(0) == 1){
                heightOfBox += 1;
                down();
            }
            if(isClearDown() == false){
                setData(1, 1);
            }
        }
        
        if(isClearRight() == true && getData(2) == 0){
            right();
            setData(2, 1);
        }
        if(isClearUp() == true && getData(1) == 1){
            up();
        }
        
        if(isClearRight() == true && getData(0) == 1 && getData(1) == 1){
            right();
        }
    }
}
