import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NormalLine extends AllBrushes
{
    private Color color;
    private GreenfootImage img;
    private boolean isFollowing = false;
    private int startingX;
    private int startingY;
    private int thickness = 0;

    public NormalLine(Color color){
        super(color);
        img = new GreenfootImage(5, 5);
        img.setColor(color);
        img.fill();
        setImage(img);
    }

    public void followMouse(){                                        
        if(Greenfoot.getMouseInfo() != null && isFollowing == true){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());            
        }
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

    public void Trail(){
        if(isFollowing == true && Greenfoot.getMouseInfo() != null){         
            Canvas fancy = (Canvas) getWorld();
            GreenfootImage background = fancy.getBackground();
            background.setColor(Color.BLACK);
            background.drawLine(startingX, startingY, Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());                
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
}

