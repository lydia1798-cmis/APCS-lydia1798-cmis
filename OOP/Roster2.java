import java.util.*;

public class Roster2
{
    List<Student> myStudents = new ArrayList<Student>();

    public static void main(){
        Roster2 apComputerScience = new Roster2();
        System.out.println("First time" + apComputerScience);                
        apComputerScience.addStudent(new Student("Spazy", "Ritchie", 11, false, 1.0, 2.0, 3.0, 4.0, 4.0));        
        System.out.println("Second Time" + apComputerScience);
        apComputerScience.dropStudent("Ritchie");
        System.out.println("Third Time" + apComputerScience);        
    }

    public Roster2(){          
    }    

    public void addStudent(Student newStudent){
        myStudents.add(newStudent);
    }

    public void dropStudent(String lastName){
        for(int i = 0; i < myStudents.size(); i++){
            if(myStudents.get(i).getLastName().equals(lastName)){
                myStudents.remove(i);
            }
        }
    }
    
    public String toString(){
        String out = "";
        for(int i = 0; i < myStudents.size(); i++){        
            out += "Student #" + i + ":\n";
            out += myStudents.get(i) + "\n";
        }        
        return out;
    }

}

