import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class BobI extends Robot
{

    public BobI(){
        super(Color.blue);
        
    }
    
    public void init(){}
    
    public void behave(){
        if(Math.random() > 0.5){
            right();
        }else{
            int dir = Greenfoot.getRandomNumber(3);
            System.out.println("BobI dir: " + dir);
            if(dir == 0){
                left();
            }else if(dir == 1){
                up();
            }else if (dir == 2){
                down();
            }
        }
    }
}
