import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static final int numSnowmen = 3;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Player(Color.PINK), 50, 50);
        
        

        // for(int i2 = 0; i2 < 10; i2++){
        // for(int i = 0; i < 10; i++){
        // addObject(new ColorBlock(Color.BLACK), i, i2);
        // }            
        // }

    }

    public void act(){   

    }
}
