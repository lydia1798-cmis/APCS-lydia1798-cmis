import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private Color color = Color.PINK;
    private GreenfootImage img;

    public Player(Color color){
        img = new GreenfootImage(10, 10);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());

    public void act() {
        if(Greenfoot.getMouseInfo() != null){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }                                         
    }
}

