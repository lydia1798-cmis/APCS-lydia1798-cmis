import greenfoot.*;
import java.util.ArrayList;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Canvas extends World
{
    public AllBrushes brush;
    private String stringColor;
    private Color chosenColor = Color.BLACK;
    private String SColor;   
    private World tools;
    private ArrayList<String> colors = new ArrayList<String>();

    public Canvas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        World tools = new Tools(this);
        colors.add(0, "BLACK");
        colors.add(1, "PINK");
        colors.add(2, "BLUE");
        colors.add(3, "YELLOW");
        colors.add(4, "GREEN");
        colors.add(5, "RED");
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
            for(String c : colors){
                if(SColor == c){
                    stringColor = c;
                }
            }
        }
        if(stringColor == "black"){
            chosenColor = Color.BLACK;
        }
        else if(stringColor == "pink"){
            chosenColor = Color.PINK;
        }
        else if(stringColor == "blue"){
            chosenColor = Color.BLUE;
        }
        else if(stringColor == "yellow"){
            chosenColor = Color.YELLOW;
        }
        else if(stringColor == "green"){
            chosenColor = Color.GREEN;
        }
        else{
            chosenColor = Color.RED;
        }

        addObject(new NormalLine(chosenColor), 300, 200);  

        // if(SColor != null){
        // if(brush instanceof NormalLine){
        // addObject(new NormalLine(chosenColor), 300, 200);  
        // }
        // else if(brush instanceof Firework){
        // addObject(new Firework(chosenColor), 10, 50);    
        // }
        // else{
        // addObject(new Triangle(Color.BLACK, 5), 10, 50);    
        // }
        // }

        boolean keyPressed = Greenfoot.isKeyDown("backspace");
        if(keyPressed == true){
            SColor = null;
            Tools tools = new Tools(this);
            Greenfoot.setWorld(tools);
        }
    }
}
