import java.util.*;

public class ClockStore
{
    private List<Clock> clocksInStock = new ArrayList<Clock>(3);    

    public ClockStore(){
        Clock clock0 = new Clock(1, 23, 34);
        clocksInStock.add(clock0);
        Clock clock1 = new Clock(1, 1, 34);
        clocksInStock.add(clock1);
        Clock clock2 = new Clock(12, 23, 34);
        clocksInStock.add(clock2);
        Clock clock3 = new Clock(1, 14, 34);
        clocksInStock.add(clock3);
        Clock clock4 = new Clock(12, 23, 3);
        clocksInStock.add(clock4);
        Clock clock5 = new Clock(1, 23, 8);
        clocksInStock.add(clock5);
    }

    public ClockStore(Clock clock1){       
        clocksInStock.add(0, clock1);
    }

    public int mostSeconds(){
        int[] seconds = new int[clocksInStock.size()];
        for(int i = 0; i < clocksInStock.size()-1; i++){
            seconds[i] = clocksInStock.get(i).totalSeconds();            
        }
        int greatest = seconds[0];
        int greatIndex = 0;        
        for(int i = 0; i < seconds.length; i++){
            if(seconds[i] > greatest){
                greatest = seconds[i];
                greatIndex = i;
            }
        }
        return greatIndex;
    }
    
    public String toString(){
        String out = "";
        for(int i = 0; i < clocksInStock.size()-1; i++){            
            out += "Clock " + i + ": "; 
            out += clocksInStock.get(i);
        }
        out += "\nThe clock with the most seconds is Clock"+ mostSeconds();
        return out;
    }
}

