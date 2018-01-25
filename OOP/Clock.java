public class Clock
{
    //clock info
    private int hours;
    private int minutes;
    private int seconds;
    
    //zero argumnet constructor
    public Clock(){
        hours = 01;
        minutes = 5;
        seconds = 13;
    }
    
    //constructor with arguments
    public Clock(int hours, int minutes, int seconds){
        if(hours < 0 || hours > 24){
            this.hours = 0;
        }
        else{
            this.hours = hours;
        }
        if(minutes < 0 || minutes > 60){
            this.minutes = 30;
        }
        else{
            this.minutes = minutes;
        }
        if(seconds > 60 || seconds < 0){
            this.seconds = 31;
        }
        else{
            this.seconds = seconds;
        }
    }
}
