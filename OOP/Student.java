public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private boolean isMale;

    public Student(){
        firstName = "Lydia";
        lastName = "Ritchie";
        grade = 11;
        isMale = false;
    }

    public Student(String firstName, String lastName, int grade, boolean isMale){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.isMale = isMale;
    }

    public String toString(){
        String out = "";
        out += firstName + " " + lastName;
        out += " is in grade " + grade;
        if(isMale == false){
            out += " and is a girl.";
        }
        else{
            out += " and is a guy.";
        }
        return out;
    }
}
