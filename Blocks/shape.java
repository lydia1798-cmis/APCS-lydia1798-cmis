import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class shape extends AllBrushes
{
    private GreenfootImage img;

    public shape(Color color, int w, int l){
        super(color);
        img = new GreenfootImage(w, l);
        img.setColor(color);
    }

    public void Trail(){
        if(isFollowing == true && Greenfoot.getMouseInfo() != null){         
            Canvas fancy = (Canvas) getWorld();
            GreenfootImage background = fancy.getBackground();
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
    
    public void followMouse(){                                        
        if(Greenfoot.getMouseInfo() != null && isFollowing == true){
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
