public class Roster
{
    private Student[] students = new Student[3];
    
    public static void main(){
        Roster roster1 = new Roster();
    }

    public Roster(){
        students[0] = new Student("Lydia", "Ritchie", 11, false, 4.0, 4.0, 4.0, 4.0, 4.0);        
        students[1] = new Student("Miriam", "Ritchie", 12, false, 4.0, 3.2, 3.7, 3.8, 3.9);
        students[2] = new Student("Miriam", "Ritchie", 12, false, 4.0, 3.2, 3.7, 3.8, 3.9);        
    }       

    public Student findStudentWithMaxGPA(){
        double maxGPA = 0;
        int index = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].calcGPA() > maxGPA){
                maxGPA = students[i].calcGPA();
                index = i;
            }
        }
        System.out.print(maxGPA);
        return students[index];
    }
}