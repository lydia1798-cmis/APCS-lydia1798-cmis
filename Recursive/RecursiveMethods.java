public class RecursiveMethods
{
    public static void main(String[] arg){
        //System.out.println(grid(2, 2, "@"));
        //System.out.println(mul(2, 0));
        System.out.println(binToDec("11111110"));
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
    
    //Number 3:
    public static String binToDec(String b){
        //maximum length of binary number - 31 bits
        //get the first character of the String 
        String firstLetter = String.valueOf(b.charAt(0)); //THIS WORKS
        return firstLetter;
        //return b.length();
    }
}
