import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seal extends Actor
{
    GreenfootImage img = getImage();     
    private int turns= 0;
    private int isTurning = 10;
    private int lifeForce = 100;
    public Seal(){
        img.scale(30, 30);
    }
    public void act() 
    {         

        if(Math.random() > 0.50){
            move(lifeForce/20);            
            if(turns == isTurning){
                turn((int)(Math.random() * 360));
                turns = 0;
            }
            turns++;
        }       
    }    

}
