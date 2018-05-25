import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class Tools extends World
{
    private NormButton n1;
    private FireworkButton f1;
    private Canvas canvas;
    
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
        
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            canvas.setBrush(new NormalLine(Color.BLACK));
            System.out.println("setBrush");
            Greenfoot.setWorld(canvas);
        }
        if(Greenfoot.mouseClicked(f1)){
            canvas.setBrush(new Firework(Color.BLUE));
            System.out.println("setBrush2");
            Greenfoot.setWorld(canvas);
        }
    }
}
