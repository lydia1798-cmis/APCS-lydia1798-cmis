import java.util.ArrayList;

public class MyPod{    
    private String color;
    private int GB;
    private ArrayList<String> songLibrary = new ArrayList<String>(3);
    
    //Zero argument constructor
    public MyPod(){
        this.color = "blue";
        this.GB = 12;
        this.songLibrary.set(0, "YMCA");
        this.songLibrary.set(1, "Here Comes The Sun");
        this.songLibrary.set(2, "Yesterday");
    }
}