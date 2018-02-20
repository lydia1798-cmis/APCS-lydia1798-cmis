import javax.swing.JOptionPane;

public class password
{
    public static void main(){
        String passwordInput = "";
        boolean stop = false;
        while(stop == false){
            passwordInput = JOptionPane.showInputDialog("Password: ");  
            if(length(passwordInput) == true && nonalphaChar(passwordInput) == true){
                stop = true;
            }
            else{
                stop = false;
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
        String all = "+-*/@";
        for(int i = 0; i < password.length(); i++){
            for(int i2 = 0; i2 < all.length(); i2++){
                if(password.substring(i, i+1).equals(all.substring(i2, i2+1))){
                    hitone = true;
                }
            }            
        }     
        return hitone;
    }
}
