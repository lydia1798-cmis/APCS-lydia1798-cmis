public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private boolean isMale;
    private double[] grades = new double[5];
    private String school1 = "Stanford"; 
    private String school2 = "Oregon"; 
    private String school3 = "UCLA"; 

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
        

    public String getGrade(){
        if(calcGPA() == 4.00){
            return "A";
        }
        else if(calcGPA() > 3.00){
            return "B";
        }
        else if(calcGPA() > 2.00){
            return "C";
        }
        else if(calcGPA() > 1.00){
            return "D";
        }
        else{
            return "F";
        }
    }
        
    public String getName(){
        return this.firstName + " " + this.lastName;        
    }    
    
    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        String out = "";
        out += "    Student's First Name is: " + firstName + "\n";
        out += "    Student's Last Name is: " + lastName + "\n";
        out += "    Student's Average GPA is: " + calcGPA() + "\n";
        out += "    " + firstName + "'s Grade: " + getGrade() + "\n";
        //out += Double.toString(grades[0]) + " " + Double.toString(grades[1]) + " " + Double.toString(grades[2]) + " " + Double.toString(grades[3]) + " " + Double.toString(grades[4]);
        return out;
    }
}
