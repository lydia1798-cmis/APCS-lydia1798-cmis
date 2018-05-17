import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private Color color;
    private GreenfootImage img;
    private GreenfootImage trail;
    private boolean isFollowing = false;

    public Player(Color color){
        img = new GreenfootImage(5, 5);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());

    public void act() {
        wasKeyPressed();  
        followMouse(); 
        Trail();
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
        if(isFollowing == true && Greenfoot.getMouseInfo() != null){           
            MyWorld fancy = (MyWorld) getWorld();
            GreenfootImage background = fancy.getBackground();
            background.setColor(Color.BLACK);
            background.drawLine(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY(), Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
}

