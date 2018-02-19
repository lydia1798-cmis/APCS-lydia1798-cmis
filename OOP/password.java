import javax.swing.JOptionPane;

public class password
{
    public static void main(){
        String passwordInput = "";
        boolean truee = false;
        while(truee == false){

            passwordInput = JOptionPane.showInputDialog("Password: ");  

            if(length(passwordInput) == true && nonalphaChar(passwordInput) == true){
                truee = true;
            }
            else{
                truee = false;
            }
        }
    }

    public static boolean length(String password){
        if(password.length() >= 6){
            return true;
        }
        else{
            return false;
        }
    }

    //+  -  * /  @ 
    public static boolean nonalphaChar(String password){  
        boolean hitone = false;
        for(int i = 0; i < password.length(); i++){
            if(password.substring(i, i+1).equals("+")){
                hitone = true;
            }
            if(password.substring(i, i+1).equals("-")){
                hitone = true;
            }
            if(password.substring(i, i+1).equals("*")){
                hitone = true;
            }
            if(password.substring(i, i+1).equals("/")){
                hitone = true;
            }
            if(password.substring(i, i+1).equals("@")){
                hitone = true;
            }
        }
        if(hitone == true){
            return true;
        }
        else{
            return false;
        }
    }
}
