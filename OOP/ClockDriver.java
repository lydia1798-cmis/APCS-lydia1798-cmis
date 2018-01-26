public class ClockDriver
{
    public static void main(){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        Clock bedroomClock = new Clock(12, 90, 78);
        //JOptionPane - you have to use input dialog
        JOptionPane.(bedroomClock);
    }
}
