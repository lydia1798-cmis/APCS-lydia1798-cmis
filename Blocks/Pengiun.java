import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pengiun extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("Up")){
            turn(90);
            move(3);
        }
        if(Greenfoot.isKeyDown("Down")){
            turn(275);
            move(3);
        }
        if(Greenfoot.isKeyDown("Left")){
           turn(180);
           move(3);
        }
        if(Greenfoot.isKeyDown("Right")){
           turn(0);
           move(3);
        }
    }    
}
