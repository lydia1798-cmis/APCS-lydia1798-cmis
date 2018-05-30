import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Firework extends AllBrushes
{ //EXPLODE    
    private Color color;    
    GreenfootImage background;
    GreenfootImage img;

    public Firework(Color color){
        super(color);
        this.color = color;
        img = new GreenfootImage(5, 5);
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);
    }

    public void addedToWorld(World canvas){
        Canvas worldCanvas = (Canvas) canvas;
        background = worldCanvas.getBackground();
        background.setColor(color);
    }

    public void Trail(){
        if(isFollowing == true && Greenfoot.getMouseInfo() != null){   
            while(Greenfoot.getKey() == "enter"){
                background.drawLine(startingX, startingY, Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            }
        }
    }

    public void wasKeyPressed(){
        String keyPressed = Greenfoot.getKey(); 
        if(Greenfoot.getMouseInfo() != null){
            int x = Greenfoot.getMouseInfo().getX();
            int y = Greenfoot.getMouseInfo().getY();
            if(keyPressed != null && keyPressed.equals("space")){
                if(isFollowing == true){
                    isFollowing = false;
                }
                else{
                    isFollowing = true;
                    startingX = x;
                    startingY = y;
                }
            }
        } 
    }

    public void followMouse(){                                        
        if(Greenfoot.getMouseInfo() != null ){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());               
        }
    }

    public void act() 
    {  
        wasKeyPressed();  
        followMouse(); 
        Trail();
    }

}
