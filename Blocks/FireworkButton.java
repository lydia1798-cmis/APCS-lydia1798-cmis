import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FireworkButton extends Actor
{
    private GreenfootImage img = new GreenfootImage(120, 50);
    private Canvas canvas;

    public FireworkButton(){
        img.setColor(Color.PINK);
        img.drawRect(0, 0, 120, 50);
        img.fillRect(0, 0, 120, 50);
        setImage(img);
        // img.setColor(Color.BLACK);
        // img.setFont(new Font(20));
        // img.drawString("Shape", 17, 30);
        // setImage(img);
    }

    public void act() 
    {
        
    }      
}
