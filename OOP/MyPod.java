import java.util.*;

public class MyPod{    
    private String color;
    private int GB;
    private List<Song> songLibrary = new ArrayList<Song>(3);
    
    
    //Zero argument constructor
    public MyPod(){
        this.color = "blue";
        this.GB = 12;
        Song song1 = new Song("YMCA", 123, true, 2013);
        this.songLibrary.add(0, song1);
        Song song2 = new Song("Here Comes The Sun", 123, true, 2013);
        this.songLibrary.add(1, song2);
        Song song3 = new Song("Yesterday", 123, true, 2013);
        this.songLibrary.add(2, song3);
    }
    
    //Multi-argument constructor
    public MyPod(String color, int GB, ArrayList<Song> songLibrary){
        this.color = color;
        this.GB = GB;        
        for(int i = 0; i < songLibrary.size(); i++){
            this.songLibrary.add(songLibrary.get(i));
        }
    }
    
    public String toString(){
        String out = "";
        out += "The ipod is " + this.color + ".";
        out += "It contains " + GB + " gigabites and ";
        out += "it has these songs:\n";
        for(Song s: songLibrary){
            out += s;
        }
        out += "\n";
        return out;
    }
}