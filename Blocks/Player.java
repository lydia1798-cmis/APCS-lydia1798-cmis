import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private Color color = Color.PINK;
    private GreenfootImage img;
    private boolean isFollowing = false;

    public Player(Color color){
        img = new GreenfootImage(10, 10);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());

    public void act() {
        wasKeyPressed();  
        if(Greenfoot.getMouseInfo() != null && isFollowing == true){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }                                         
    }            

    public void wasKeyPressed(){
        if(Greenfoot.isKeyDown("Space") == true && isFollowing == false || Greenfoot.isKeyDown("Space") == false && isFollowing == true){
            isFollowing = true;
        } 
        else if(Greenfoot.isKeyDown("Space") == true && isFollowing == true || Greenfoot.isKeyDown("Space") == false && isFollowing == false){ 
            isFollowing = false;
        }        
    }
}

