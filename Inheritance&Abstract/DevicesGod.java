import java.util.*;

public abstract class DevicesGod
{
    private List<MyDevice> devices = new ArrayList<MyDevice>();
    
    public static void main(){
        RunningClock clock1 = new RunningClock("Running Clock", 56, 62, 6.30);
        System.out.println(clock1);
    }
}
