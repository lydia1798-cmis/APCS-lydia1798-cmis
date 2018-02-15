public class Clock
{
    //clock info
    private int hours;
    private int mins;
    private int secs;
    
    //zero argumnet constructor
    public Clock(){
        hours = 0;
        mins = 0;
        secs = 0;
    }
    
    //constructor with arguments
    public Clock(int hours, int mins, int secs){
        if(hours < 0 || hours > 24){
            this.hours = 0;
        }
        else{
            this.hours = hours;
        }
        if(mins < 0 || mins > 60){
            this.mins = 0;
        }
        else{
            this.mins = mins;
        }
        if(secs > 60 || secs < 0){
            this.secs = 0;
        }
        else{
            this.secs = secs;
        }
    }
    
    public void setTime(int hours, int mins, int secs){
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    public void convertDaylightSaving(int hours){
        this.hours = this.hours + hours;
    }
    
    public int totalSeconds(){
        int out = 0;
        out += this.hours*3600;
        out += this.mins*60;
        out += this.secs;
        return out;
    }
    
    //toString method
    public String toString(){
        String out = "";
        out += "The time is ";
        out += hours + ":";
        out += mins + ":";
        out += secs + "\n";
        out += "Total seconds: " + totalSeconds();
        return out;
    }
}
