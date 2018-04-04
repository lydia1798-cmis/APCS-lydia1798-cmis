import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Important World methods:
 * addObject
 * getObjects
 * setPaintOrder
 * showText
 * 
 * Important Greenfoot methods:
 * stop
 */
public class TheBeach extends World
{
    public static final int W = 1000;
    public static final int H = 700;
    public static final int NSTARFISH = 5;
    public static final int NShrew = 5;
    public TheBeach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(W, H, 1); 
        setPaintOrder(Fruit.class, Animal.class);
        for(int i = 0; i < NSTARFISH; i++){
            addObject(new Starfish(), (int)(Math.random() * W), (int)(Math.random() * H));
        }
        for(int i = 0; i < NShrew; i++){
            addObject(new Shrew(), (int)(Math.random() * W), (int)(Math.random() * H));
        }
    }

    public void act(){
        if(Math.random() > 0){
            int x = (int)(Math.random() * W);
            int y = (int)(Math.random() * H);
            if(Math.random() > 0.5){
                addObject(new Banana(), x, y);
            }else{
                addObject(new Cherry(), x, y);
            }
        }
        List<Starfish> allStarfish = getObjects(Starfish.class);
        if(allStarfish.size() == 0){
            showText("All the starfish are dead!", W/2, H/2);
            Greenfoot.stop();
        } else if (allStarfish.size() == 1){
            showText("I'm so lonely!", W/2, H/2);
        }
         List<Shrew> allShrew = getObjects(Shrew.class);
        if(allShrew.size() == 0){
            showText("All the Shrew are dead!", W/2, H/2);
            Greenfoot.stop();
        } else if (allShrew.size() == 1){
            showText("I'm so lonely!", W/2, H/2);
        }
    }
}
