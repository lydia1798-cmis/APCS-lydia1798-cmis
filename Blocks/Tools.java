import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class Tools extends World
{
    private TriButton t1;
    private Canvas canvas;
    
    public Tools(Canvas canvas)
    {    
        super(600, 400, 1); 
        this.canvas = canvas;
        t1 = new TriButton();
        addObject(t1, 300, 100);
        showText("Triangles", 300, 100);
        
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(t1)){
            canvas.setBrush(new Triangle(Color.BLACK, 10));
            Greenfoot.setWorld(canvas);
        }
    }
}
