import javax.swing.JOptionPane;

public class StudentDriver
{
    public static void main(){
        Student senior001 = new Student();
        System.out.println(senior001);
        Student junior001 = new Student("Zoe", "Chamberlain", 11, true);
        JOptionPane.showMessageDialog(null, junior001);
    }
}