
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class CopyOfharryPotter extends Robot
{
    public CopyOfharryPotter(){
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
        getToTopLeft();
        scanTheRoom();
    }

    public void getToTopLeft(){
        //getData(0) = gotten bottom right then top left
        //getData(1) = right x axis value
        //Get to bottom right corner
        if(getData(0) < 2){
            if(isClearRight() == false && getData(0) == 0){
                setData(1, getX());
                down();
                System.out.println(getData(1));
            }
            else{
                if(isClearDown() == false && getData(2) == 1 && getData(0) == 0){
                    right();
                }
                if(isClearLeft() == false && getData(0) == 0){
                    //getData(2) = determining if have reached the bottom
                    setData(2, 1);
                    down();
                }
                setData(1, getX());
                System.out.println(getData(1));
            }
            if(isClearRight() == false && isClearDown() == false){
                setData(0, 1);
            }
            //getting to top left corner from bottom right
            if(getData(0) == 1 && isClearLeft() == true){
                left();
            }
            if(getData(0) == 1 && isClearLeft() == false){
                up();
            }
            if(getData(0) == 1 && isClearUp() == false && isClearLeft() == false){
                setData(0, 2);
                setData(2, 0);
            }
        }
    }

    public void scanTheRoom(){
        //can use getData(2)
        //odd = up
        //even = down
        if(getData(2) == 0){
            //check if hit box
            if(isClearRight == false && getX() == getData(1)){
            }
            //moving right at the top
            if(isClearLeft() == false && getX() % 2 != 0){
                right();
            }
            //moving down
        }
    }
}
