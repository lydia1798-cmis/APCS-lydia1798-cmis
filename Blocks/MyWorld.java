import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static final int numSnowmen = 3;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new block2(Color.MAGENTA), 40, 50);
        addObject(new Player(Color.PINK), 50, 50);
        addObject(new Player(Color.BLUE), 10, 50);
        addObject(new Player(Color.BLACK), 20, 50);
        addObject(new Player(Color.GRAY), 30, 50);
        addObject(new Player(Color.YELLOW), 40, 50);
        addObject(new Player(Color.MAGENTA), 60, 50); 

        // for(int i2 = 0; i2 < 10; i2++){
        // for(int i = 0; i < 10; i++){
        // addObject(new ColorBlock(Color.BLACK), i, i2);
        // }            
        // }

    }

    public void createMaze(ColorBlock block){
        //Have two options
        if(Math.random() < 0.50){
            //have 
        }
    }

    public void act(){   

    }
}
