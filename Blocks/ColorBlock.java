import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ColorBlock extends Actor   
{ //EXPLODE
    private static Color color;
    private GreenfootImage img;
    private boolean isFollowing = false;
    private boolean istouching = false;

    public ColorBlock(Color color){
        this.color = color;
        img = new GreenfootImage(5, 5);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    public void act() 
    {  
        if(istouching == false){
            isTouchingPlayer();
        }
        if(istouching == true){
            //wasKeyPressed();
            followMouse2();
        }
    }

    public void isTouchingPlayer(){        
        if(isTouching(Player.class) == true){ 
            istouching = true;
        }
    }

    public static Color getColor(){
        return color;
    }

    public void followMouse2(){    
        MouseInfo info = Greenfoot.getMouseInfo();
        if(Greenfoot.getMouseInfo() != null)
            setLocation(info.getX(), info.getY());
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
}
