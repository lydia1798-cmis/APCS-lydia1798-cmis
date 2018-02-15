public class StudentDriver2
{
    public static void main(){
        Student senior = new Student("Joe", "Senior", 12, false, 4.0, 4.0, 3.5, 4.0, 4.0);
        System.out.println("#1: "+ senior + "\n");
        senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        System.out.println("#2: "+ senior + "\n");
        
        
    }
}
