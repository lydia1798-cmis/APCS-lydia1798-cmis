import greenfoot.*; 
import java.util.ArrayList;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class Tools extends World
{
    private NormButton n1;
    private FireworkButton f1;
    private Canvas canvas;
    private ArrayList<AllBrushes> brushes = new ArrayList<AllBrushes>();
    
    public Tools(Canvas canvas)
    {    
        super(600, 400, 1); 
        this.canvas = canvas;
        n1 = new NormButton();
        f1 = new FireworkButton();
        addObject(n1, 300, 100);
        showText("Normal Line", 300, 100);
        addObject(f1, 300, 200);
        showText("Firework Line", 300, 200);
        brushes.add(0, new NormalLine(Color.BLACK));
        brushes.add(1, new Firework(Color.BLACK));
        brushes.add(2, new Triangle(Color.BLACK, 5));
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            canvas.setBrush(brushes.get(0));
            System.out.println("setBrush");
            Greenfoot.setWorld(canvas);
        }
        if(Greenfoot.mouseClicked(f1)){
            canvas.setBrush(brushes.get(1));
            System.out.println("setBrush2");
            Greenfoot.setWorld(canvas);
        }
    }
}
