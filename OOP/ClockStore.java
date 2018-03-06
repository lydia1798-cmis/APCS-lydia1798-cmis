import java.util.*;

public class ClockStore
{
    private List<Clock> clocksInStock = new ArrayList<Clock>(3);
    
    public void main(){
        Clock clock1 = new Clock(12, 23, 34);
        this.clocksInStock.add(0, clock1);
        Clock clock1 = new Clock(12, 23, 34);
        this.clocksInStock.add(0, clock1);
    }
}
