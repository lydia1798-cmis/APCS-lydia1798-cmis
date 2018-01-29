import javax.swing.JOptionPane;

public class ClockDriver
{
    public static void main(){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);        
        //JOptionPane - you have to use input dialog
        String inputSec;
        inputSec = JOptionPane.showInputDialog("seconds: ");        
        String inputMin;
        inputMin = JOptionPane.showInputDialog("minutes: ");
        String inputHour;
        inputHour = JOptionPane.showInputDialog("Hours: ");
        Clock bedroomClock = new Clock(Integer.valueOf(inputSec), Integer.valueOf(inputMin), Integer.valueOf(inputHour));
        System.out.println("Bedroom Clock: " + bedroomClock); 
    }
}
