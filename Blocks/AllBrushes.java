import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class AllBrushes extends Actor
{
    Color color;
    boolean isFollowing = false;
    int startingX;
    int startingY;
    int thickness = 0;    

    public AllBrushes(Color color){
        color = color;
    }

    public abstract void Trail();

    public abstract void followMouse();                                        
       
    public abstract void wasKeyPressed();
    

    public void act() 
    {       
    }    
}
