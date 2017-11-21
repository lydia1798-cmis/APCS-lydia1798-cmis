
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class harryPotter2 extends Robot
{
    public harryPotter2(){
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

        reachedTopLCorner();
        scanningRoom();
        //Counting height
        /*if(getData(1) == 0){ 
        if(isClearDown() == true && getData(0) == 1){

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
        int downcounter = 0;
        if(isClearUp() == true && getData(1) == 1 && getData(3) == 0 && getX() % 2 != 0){
        up();
        }*/

    }

    public void reachedTopLCorner(){
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
    }

    public void scanningRoom(){
        if(getData(0) == 1 && getData(2) == 0){ //scanning the entire room
            //first down only!!!!!!!!!!!!!!
            //setting data point
            if(isClearDown() == true && getX() % 2 != 0){
                setData(5, 0);
                System.out.println(getData(5));
                setData(1, getData(1) + 1);
                System.out.println(getData(1));
                down();
            }
            int setHeight = getData(1);
            int length = 11;
            System.out.println(setHeight);

            if(isClearDown() == false && getData(1) != setHeight && getData(4) == 0){
                setData(4, 1);
                right();
            }
            if(isClearUp() == false && getData(1) != setHeight && getData(4) == 0){
                setData(4, 1);
                right();
            }

            //down that is repatitive
            //actually running things
            if(isClearDown() == true && getX() % 2 != 0){
                setData(4, getData(1) + 1);
                down();

            }
            if(isClearRight() == true && getData(5) < length && isClearDown() == false){
                setData(1, 0);
                setData(5, getData(5) + 1);
                System.out.println(getData(5));
                right();
            }

            if(isClearUp() == true && getX() % 2 == 0){
                setData(5, 0);
                System.out.println(getData(5));
                setData(1, getData(1) + 1);
                System.out.println(getData(4));
                up();
            }

            if(isClearRight() == true && getData(5) < length && isClearUp() == false){
                setData(1, 0);
                setData(5, getData(5) + 1);
                System.out.println(getData(5));
                right();
            }

        }
    }
}

