import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private Color color;
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
        followMouse();                                
    }   

    public void followMouse(){                                        
        if(Greenfoot.getMouseInfo() != null && isFollowing == true){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }

    public void wasKeyPressed(){
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null && keyPressed.equals("space")){
            if(isFollowing == true){
                isFollowing = false;
            }
            else{
                isFollowing = true;
            }
        }
    }    

    public void Trail(){
        if(isFollowing == true){
            MyWorld fancy = (MyWorld) getWorld();
            trail t1 = new trail(Color.BLUE);
            fancy.addObject(t1, getX(), getY());
        }
    }
}


