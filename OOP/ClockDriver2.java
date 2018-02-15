public class ClockDriver2
{
    public static void main(){
        Clock clock1 = new Clock();
        System.out.println("#1: \n" + clock1 + "\n");
        clock1.setTime(3, 4, 5);
        System.out.println("#2: \n" + clock1 + "\n");
        clock1.convertDaylightSaving(4);
        System.out.println("#3: \n" + clock1 + "\n");
    }
}