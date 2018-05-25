import greenfoot.*;
import java.util.ArrayList; 
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Canvas extends World
{
    public AllBrushes brush;
    private Color chosenColor = Color.BLACK;
    private String SColor;
    private ArrayList<AllBrushes> brushes = new ArrayList<AllBrushes>();
    private World tools;
    
    public Canvas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        World tools = new Tools(this);
        // if(SColor == null){
            // if(brush instanceof Triangle){
                // addObject(new Triangle(chosenColor, 5), 300, 200);  
            // }
            // else{
                // addObject(new Firework(chosenColor), 10, 50);    
            // }
        // }

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

    public void setBrush(AllBrushes brush){
        this.brush = brush;
    }

    public void act(){ 
        if(SColor == null){
            SColor = Greenfoot.ask("(no caps) (black, pink, blue, yellow, green, red) Color: ");
            if(SColor == "black"){
                chosenColor = Color.BLACK;
            }
            if(SColor == "pink"){
                chosenColor = Color.PINK;
            }
            if(SColor == "blue"){
                chosenColor = Color.BLUE;
            }
            if(SColor == "yellow"){
                chosenColor = Color.YELLOW;
            }
            if(SColor == "green"){
                chosenColor = Color.GREEN;
            }
            if(SColor == "red"){
                chosenColor = Color.RED;
            }
        }
        
         if(SColor != null){
            if(brush instanceof NormalLine){
                addObject(new NormalLine(chosenColor), 300, 200);  
            }
            if(brush instanceof Firework){
                addObject(new Firework(chosenColor), 10, 50);    
            }
        }

        boolean keyPressed = Greenfoot.isKeyDown("backspace");
        if(keyPressed == true){
            SColor = null;            
            Greenfoot.setWorld(tools);
        }
    }
}
