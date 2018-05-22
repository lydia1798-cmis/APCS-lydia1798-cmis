import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Canvas extends World
{
    public Canvas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new NormalLine(Color.PINK), 50, 50);  
        //addObject(new Firework(Color.BLUE), 10, 50);    

        // for(int i2 = 0; i2 < 400; i2 += 5){
        // for(int i = 0; i < 600; i += 5){
        // if(Math.random() < 0.83){
        // addObject(new ColorBlock(Color.BLACK), i, i2);
        // }
        // else if(Math.random() < 0.83){
        // addObject(new ColorBlock(Color.BLUE), i, i2);
        // }
        // else if(Math.random() < 0.83){
        // addObject(new ColorBlock(Color.MAGENTA), i, i2);
        // }
        // }            
        //}

    }

    public void act(){ 
        String keyPressed = Greenfoot.getKey();
        if(keyPressed != null && keyPressed.equals("backspace")){
            Greenfoot.setWorld(Tools);
        }
    }
}
