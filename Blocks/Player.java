import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private Color color;
    private GreenfootImage img;
    private GreenfootImage trail;
    private boolean isFollowing = false;
    private int startingX;
    private int startingY;
    private int thickness = 10;

    public Player(Color color){
        img = new GreenfootImage(5, 5);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());

    public void act() {
        wasKeyPressed();  
        //followMouse(); 
        if(Greenfoot.getMouseInfo() != null){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
        Trail();
        if(Greenfoot.getMouseInfo() != null && isFollowing == true){
            startingX = Greenfoot.getMouseInfo().getX();
            startingY = Greenfoot.getMouseInfo().getY();
        }
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
                startingX = Greenfoot.getMouseInfo().getX();
                startingY = Greenfoot.getMouseInfo().getY();
            }
        }
    }    

    public void Trail(){
        if(isFollowing == true && Greenfoot.getMouseInfo() != null){ 
            for(int i = 1, i2 = 0; i < thickness; i++, i2++){
                MyWorld fancy = (MyWorld) getWorld();
                GreenfootImage background = fancy.getBackground();
                background.setColor(Color.BLACK);
                    background.drawLine(startingX + i, startingY + i, Greenfoot.getMouseInfo().getX() + i2, Greenfoot.getMouseInfo().getY() + i2);
                
                    background.drawLine(startingX - i, startingY - i, Greenfoot.getMouseInfo().getX() - i2, Greenfoot.getMouseInfo().getY() - i2);
                }
            }
        }
    }


