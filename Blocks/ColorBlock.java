import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ColorBlock extends Actor   
{ //EXPLODE
    private Color color = Color.BLACK;
    private GreenfootImage img;
    
    public ColorBlock(Color color){
        this.color = color;
        img = new GreenfootImage(10, 10);
        img.setColor(color);
        img.fill();
        setImage(img);
    }
    
    public void act() 
    {  
    }    
}
