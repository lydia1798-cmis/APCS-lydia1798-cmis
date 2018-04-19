import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static final int numSnowmen = 3;
    boolean pushed = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        for(int i = 0; i < 10; i++){
            addObject(new Seal(), 200, 100);
        }       
        Greenfoot.stop();
    }

    public void act(){    
        // if(pushed == false && Greenfoot.isKeyDown("space") == true){
        // pushed = true;
        // }
        // if(pushed == true){
        // Greenfoot.start();
        // }

    }
}
