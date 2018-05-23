import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Triangle extends AllBrushes
{
    private GreenfootImage img;
    private int w;

    public Triangle(Color color, int w){
        super(color);
        this.w = w;
        img.setColor(color);
    }

    public void Trail(){
        Canvas fancy = (Canvas) getWorld();
        GreenfootImage background = fancy.getBackground();
        background.setColor(Color.BLACK);
        for(int i = 0; i < w; i++){
            if(i % 2 == 0){
                background.drawLine(startingX + i, startingY + i, Greenfoot.getMouseInfo().getX() - i, Greenfoot.getMouseInfo().getY() - i);
                background.drawLine(startingX - i, startingY - i, Greenfoot.getMouseInfo().getX() + i, Greenfoot.getMouseInfo().getY() + i);
            }
            else{
                background.drawLine(startingX - i, startingY - i, Greenfoot.getMouseInfo().getX() + i, Greenfoot.getMouseInfo().getY() + i);
                background.drawLine(startingX + i, startingY + i, Greenfoot.getMouseInfo().getX() - i, Greenfoot.getMouseInfo().getY() - i);
            }
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
