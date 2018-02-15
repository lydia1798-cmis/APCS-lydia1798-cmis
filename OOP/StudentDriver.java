import javax.swing.JOptionPane;

public class StudentDriver
{
    public static void main(){
        Student senior001 = new Student();
        System.out.println(senior001);
        Student junior001 = new Student("Zoe", "Chamberlain", 11, false, 4.0, 4.0, 4.0, 4.0, 2.0);
        JOptionPane.showMessageDialog(null, junior001);
    }
}