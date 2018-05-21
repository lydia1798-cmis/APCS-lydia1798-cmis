import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public abstract class Image extends Actor
{
    Color color;
    private boolean isFollowing = false;
    private int startingX;
    private int startingY;
    private int thickness = 0;
    MyWorld fancy = (MyWorld) getWorld();
    GreenfootImage background = fancy.getBackground();
    
    public Image(Color color){
        color = color;
    }
    
    public void act() 
    {       
    }    
}
