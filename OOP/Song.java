public class Song
{
    //characteristics of the song
    private String name;
    private int bpm;
    private boolean isGood;

    //zero argument constructor
    public Song(){
        name = "YMCA";
        bpm = 120;
        isGood = false;
    }

    public Song(String name, int bpm, boolean isGood){
        if(name.equals ("YMCA")){
            this.name = "The Star Spangled Banner";
        }
        else{
            this.name = name;
        }
        if(bpm > 320){
            this.bpm = 319;
        }
        else{
            this.bpm = bpm;
        }
        this.isGood = isGood;
    }

    public String toString(){
        String out = "";
        out += "Name: " + name + "\n";
        out += "Beats per Minute: " + bpm + "\n";
        out += "This is a good song. " + isGood + "\n";
        return out;
    }
}
