public class RecursiveMethods
{
    public static void main(String[] arg){
        //System.out.println(grid(2, 2, "@"));
        //System.out.println(power(2, 0));
        //System.out.println(binToDec("11"));
        //System.out.println(reverse("I can't do this"));
    }

    //Number 1:
    public static String grid(int w, int h, String symbol){
        if(h == 0){
            return "";
        }
        else{
            return row(w, symbol) + "\n" + grid(w, h - 1, symbol);
        }
    }

    public static String row(int w, String symbol){
        if(w == 0){
            return "";
        }
        else{
            return symbol + row(w - 1, symbol);
        }
    }

    //Number 2:
    public static int mul(int a, int b){
        if(a > 0){            
            return b + mul(a - 1, b);
        }

        else if(a < 0){
            return -b + mul(a + 1, b);            
        }        
        return 0;
    }
    //POWER METHOD
    public static int power(int n, int x){
        //base case
        if(x == 0){
            return 1;
        }
        //recursive case
        else{
            return n * power(n, x - 1); //the value of the recursive call is what it returned last time
        }        
    }
    //Number 3:
    public static int binToDec(String b){
        //maximum length of binary number - 31 bits        
        //base case
        if(b.length() == 0){
            return 0;
        }
        else{
            int integer = Integer.parseInt(b.substring(0,1));
            return integer * power(2,b.length() - 1) + binToDec(b.substring(1, b.length()));                          
        }
    }
    
    public static String reverse(String s){
       if(s.length() == 1){
           return s;
       }
       else{
           return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
       }
    }
    
    public static String remove(String s, String t){
        //if(s.length()//idk       
        return t;
    }
}
