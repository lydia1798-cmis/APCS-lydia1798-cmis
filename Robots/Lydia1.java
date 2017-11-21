import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lydia1 extends Robot
{
    public Lydia1(){
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
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
         if(isClearRight() == false && isClearUp() == false && isClearDown() == false){
            left();
         }
         
         else if(isClearLeft() == false && isClearRight() == false && isClearDown() == false){
             up();
         }
         
         else if(isClearRight() == true){
             right();
         }
         else if(isClearUp() == true){
             up();
         }
         else if(isClearDown() == true){
             down();
         }
         else if(isClearLeft() == true){
             left();
         }
        
     }

}