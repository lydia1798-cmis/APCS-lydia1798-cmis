import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class trail extends Actor
{
    private Color color;
    private GreenfootImage img;

    public trail(Color color){
        img = new GreenfootImage(5, 5);
        img.setColor(color);
        img.fill();
        setImage(img);
    }
    
    public void act() 
    {
        // // MyWorld fancy = (MyWorld) getWorld();
        // Greenfoot.delay(80);
        // fancy.removeObject(this);
    }    
}
