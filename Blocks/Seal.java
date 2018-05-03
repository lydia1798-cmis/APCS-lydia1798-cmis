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
        if(Greenfoot.mousePressed(getWorld()) == true){
            
        setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
     
    }    }

}
