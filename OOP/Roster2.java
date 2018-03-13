import java.util.*;

public class Roster2
{
    List<Student> myStudents = new ArrayList<Student>();
    
    public static void main(){
        Roster apComputerScience = new Roster();        
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
}
