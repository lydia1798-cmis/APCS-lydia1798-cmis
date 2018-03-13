import java.util.*;

public class Roster2Driver
{
    public static void main(){
        Roster2 apComputerScience = new Roster2();
        apComputerScience.addStudent(new Student("Spazy", "Grace", 11, false, 1.0, 2.0, 3.0, 4.0, 4.0));
        apComputerScience.addStudent(new Student("Hot Dang", "Ritchie", 11, false, 1.0, 1.0, 1.0, 1.0, 1.0));
        apComputerScience.addStudent(new Student("Okkkaaayyy", "Sarah", 11, false, 4.0, 4.0, 4.0, 4.0, 4.0));
        System.out.println("Period 1:\n" + apComputerScience + "\n\n");        
        apComputerScience.dropStudent("Sarah");
        System.out.println("Period 1:\n" + apComputerScience + "\n\n"); 
    }
}

