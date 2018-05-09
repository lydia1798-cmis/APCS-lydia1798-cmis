import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class block2 extends Actor
{
    private Color color;
    private GreenfootImage img;
    private boolean isFollowing = true;

    public block2(Color color){
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
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null && keyPressed.equals("space")){
            if(isFollowing == false){
                isFollowing = true;
            }
            else{
                isFollowing = false;
            }
        }
    }
}

