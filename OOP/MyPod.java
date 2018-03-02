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
    
    //Multi- argument constructor
    public MyPod(String color, int GB, ArrayList<String> songLibrary){
        this.color = color;
        this.GB = GB;
        for(int i = 0; i < songLibrary.size(); i++){
            this.songLibrary.set(i, songLibrary.get(i));
        }
    }
    
    public String toString(){
        String out = "";
        out += "The ipods color is " + this.color + "\n";
        out += "It contains " + GB + " gigabites.\n";
        out += "It has these songs: ";
        for(int i = 0; i < songLibrary.size(); i++){
          out += songLibrary.get(i);  
        }           
        out += "\n";
        return out;
    }
}