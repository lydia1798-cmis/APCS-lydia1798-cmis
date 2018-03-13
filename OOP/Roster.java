public class Roster
{
    private Student[] students = new Student[3];

    //ROSTER DRIVER
    public static void main(){
        Roster roster1 = new Roster();
        System.out.println(roster1);        
    }

    public Roster(){
        students[0] = new Student("Lydia", "Ritchie", 11, false, 4.0, 4.0, 4.0, 4.0, 4.0);        
        students[1] = new Student("Miriam", "Ritchie", 12, false, 4.0, 3.2, 3.7, 3.8, 3.9);
        students[2] = new Student("Miriam", "Ritchie", 12, false, 4.0, 3.2, 3.7, 3.8, 3.9);        
    }       

    public String findStudentWithMaxGPA(){
        double maxGPA = 0;
        int index = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].calcGPA() > maxGPA){
                maxGPA = students[i].calcGPA();
                index = i;
            }
        }        
        return students[index].getName();
    }

    public String toString(){
        String out = "";
        for(int i = 0; i < students.length; i++){        
            out += "Student #" + i + ":\n";
            out += students[i] + "\n";
        }        
        out += findStudentWithMaxGPA() + " has the best GPA.\n";
        return out;
    }
}