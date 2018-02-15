public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private boolean isMale;
    private double[] grades = new double[5];

    public Student(){
        this.firstName = "Lydia";
        this.lastName = "Ritchie";
        this.grade = 11;
        this.isMale = false;
    }

    public Student(String firstName, String lastName, int grade, boolean isMale, double english, double math, double science, double fineArts, double socialScience){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.isMale = isMale;
        this.grades[0] = english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience;
    }
    
    public void setGPA(double english, double math, double science, double fineArts, double socialScience){        
        this.grades[0] = english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience;
    }
    
    public double calcGPA(){
        double sum = 0;
        for(int i = 0; i < 5; i++){
            sum += grades[i];
        }
        double finalGPA = sum/5;
        return finalGPA;
    }

    public String toString(){
        String out = "";
        out += firstName + " " + lastName;
        out += " is in grade " + grade;
        if(isMale == false){
            out += " and is a girl. ";
        }
        else{
            out += " and is a guy. ";
        }
        out += "Overall GPA: " + calcGPA() + "\n";
        return out;
    }
}
