public class Song
{
    //characteristics of the song
    private String name;
    private int bpm;
    private boolean isGood;
    private int yearReleased;

    //zero argument constructor
    public Song(){
        this.name = "YMCA";
        this.bpm = 120;
        this.isGood = false;
        this.yearReleased = 1980;
    }

    public Song(String name, int bpm, boolean isGood, int yearReleased){
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
        this.yearReleased = yearReleased + 7;
    }

    public int getYearReleased(){
        return this.yearReleased; 
    }

    public void setYearReleased(int yearReleased){
        this.yearReleased = yearReleased;
    }

    public String convertMinToSec(int lengthInSec){
        String out = "";
        int sec = lengthInSec%60;
        int min = lengthInSec/60;
        out += "    The length of the song is: " + min + " minutes and " + sec + " seconds.\n";
        return out;
    }

    public String toString(){
        String out = "";
        out += "\n    Name: " + name + "\n";
        out += "    Beats per Minute: " + bpm + "\n";
        if(isGood == true){       
            out += "    This is a good song.\n";
        }
        else{
            out += "    This is a bad song.\n";
        }
        out += "    The year this song was released was: " + yearReleased + "\n";
        out += convertMinToSec(343);
        return out;
    }
}
