import javax.swing.JOptionPane;

public class Fundamentals

{

    public static void main (String[] args){
        dataTypes();
        
        System.out.println("Int: ");
        int addSum = add(3, 4);
        System.out.println("Int Sum: " + addSum);
        
        String intSubInputA = JOptionPane.showInputDialog( "Enter a non-decimal number to subtract:" );
        String intSubInputB = JOptionPane.showInputDialog( "Enter a second non-decimal number to subtract:" );
        int intDifference = sub(Integer.parseInt(intSubInputA), Integer.parseInt(intSubInputB));
        System.out.println("Int Difference: " + intDifference);
        
        int mulProduct = multiply(10, 5);
        System.out.println("Int Product: " + mulProduct);
        
        String intDivInputA = JOptionPane.showInputDialog( "Enter a non-decimal number to divide:" );
        String intDivInputB = JOptionPane.showInputDialog( "Enter a second non-decimal number to divide:" );
        int intQuiotient = division(Integer.parseInt(intDivInputA), Integer.parseInt(intDivInputB));
        System.out.println("Int Difference: " + intQuiotient + "\n");
 
        
        System.out.println("Double: ");
        double sum = addDouble(5, 6);
        System.out.println("Double Sum: " + sum);
        
        String subInputA = JOptionPane.showInputDialog( "Enter a decimal number to subtract:" );
        String subInputB = JOptionPane.showInputDialog( "Enter a second decimal number to subtract:" );
        double difference = subDouble(Double.parseDouble(subInputA), Double.parseDouble(subInputB));
        System.out.println("Double Difference: " + difference);
        
        double product = multiplyDouble(59, 6);
        System.out.println("Double Product: " + product);
        
        String divInputA = JOptionPane.showInputDialog( "Enter a decimal number to divide:" );
        String divInputB = JOptionPane.showInputDialog( "Enter a second decimal number to divide:" );
        double quotient = divisionDouble(Double.parseDouble(divInputA), Double.parseDouble(divInputB));
        System.out.println("Double Quotient: " + quotient + "\n");
        
        String a = JOptionPane.showInputDialog( "Enter any non-decimal number: ");
        String b = JOptionPane.showInputDialog( "Enter any non-decimal number: ");
        System.out.println("Compare: ");
        compare(Integer.parseInt(a), Integer.parseInt(b));
        
        String a2 = JOptionPane.showInputDialog( "Enter any non-decimal number: ");
        System.out.println("evenOddZero: " +  evenOddZero(Integer.parseInt(a2)));
        


    } //end main method

    public static void dataTypes(){
        System.out.println( "dataTypes:\n" );

        byte byteExample = 58;
        System.out.println( "byte: " + byteExample);
        String byteDescription = "Byte is a primitive data type that is an 8-bit signed two component integer type. \nIt has a minimum value of -128 and a maximum value of 127 and is ussually used to save memory.";
        System.out.println( "Description: " + byteDescription);
        String byte3Examples = "1)Byte could be used to represent a list of numbers for a survey. \n2)Byte could be used to perform simple calculations. \n3)Byte can be used for the number of classes a student can take in highschool. \n"; 
        System.out.println( "3 Real World Examples: \n" + byte3Examples);

        short shortExample = -23678;
        System.out.println( "short: " + shortExample);
        String shortDescription = "Short is a primitive data type that is a 16-bit two's completment integer. \nIt has a minimum value of -2^15 and a maximum value of 2^15 -1 and is also used to save memory as it is 2 times smaller than an integer.";
        System.out.println( "Description: " + shortDescription + "\n");

        int intExample = 45758678; 
        System.out.println( "int: " + intExample);
        String intDescription = "Int is short for integer and is a primitive data type. It is a 32-bit signed two's complement integer. \nIt has a minimum value is -2^31 and a maximum value of 2^31 -1.";
        System.out.println( "Description: " + intDescription + "\n");

        long longExample = -2^50;
        System.out.println("long: " + longExample);
        String longDescription = "Long is a primitive data type that is a a 64-bit signed two's complement integer. \nIt has a minimum value of -2^63 and a maximum value of 2^63 -1 and is used when you need a wider range than provided for by int.";
        System.out.println( "Description: " + longDescription + "\n");
        
        float floatExample = 56.6f;
        System.out.println("float: " + floatExample);
        String floatDescription = "Float is a primitve data type that is single-presicion 32-bit IEEE 754 floating point. \nA float can be used when working with decimals.\nWhen used in java, there must be an 'f' after the desired number.";
        System.out.println( "Description: " + floatDescription + "\n");
        
        double doubleExample = 78889.87;
        System.out.println("double: " + doubleExample);
        String doubleDescription = "Double is a primitive data type that is a double-precicion 64-bit IEE 754 floating point. \nIt can be used when working with big decimals as is the default primitive data type for decimals.";
        System.out.println( "Description: " + doubleDescription + "\n");

        boolean booleanExample = true;
        System.out.println("boolean: " + booleanExample);
        String booleanDescription = "Boolean is the smallest primitive data type. \nBoolean only has two possible values, true or false; the default being false.";
        System.out.println( "Description: " + booleanDescription + "\n");

        char charExample = 'a';
        System.out.println("char: " + charExample);
        String charDescription = "Char is a primitive data type that is a single 16-bit Unicode character. \nIt has a minimum value of \u0000 (0) and a maximum value of \uffff (65,535 inclusive). \nChar is used to store any type of character.";
        System.out.println( "Description: " + charDescription + "\n");

        
    }
    //end of data types
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static int sub(int a, int b){
        int difference = a - b;
        return difference;
    }
    
    public static int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    
    public static int division(int a, int b){
        int divide = a / b;
        return divide;
    }
    
     public static double addDouble(double a, double b){
        double sum = a + b;
        return sum;
    }
    
    public static double subDouble(double a, double b){
        double difference = a - b;
        return difference;
    }
    
    public static double multiplyDouble(double a, double b){
        double multiply = a * b;
        return multiply;
    }
    
    public static double divisionDouble(double a, double b){
        double divide = a / b;
        return divide;
    }
    //end of math
    
    public static void compare(int a, int b){
        String output;
        if (a > b) {
            output = ("The value of a is " + Integer.toString(a) + " and it is greater than b whose value is " + Integer.toString(b) + ".\n");
            System.out.println(output);
        }
        else if (b > a) {
            output = ("The value of a is " + Integer.toString(a) + " and it is less than b whose value is " + Integer.toString(b) + ".\n");
            System.out.println(output);
        }
        else if (a == b) {
            output = ("The vaule of a is " + Integer.toString(a) + " and it is equal to b whose vaule is " + Integer.toString(b) + ".\n");
            System.out.println(output);
        }

    }
    
    public static int evenOddZero(int a){
       int output;
       if (a == 0){
           output = 0;
       }
       
       if (a % 2 == 0){
           output = 1;
        } else {
            output = -1;
        }
       return output;    
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

    public static void squareTable(){
        for(int x = 1; x < 11; x = x + 1){
            int squared = x * x;
            System.out.println(x + "\t" + squared + "\t" + (int)Math.ceil(Math.random() * (squared - x) + x));
    }
    }
    public static int triangleNumber(int a){
        int x;
        int n = 0;
        for(x = a; x > 0; x = x - 1){ 
        n = n + x;   
       } 
    return n;
   }
   public static int pyramidNumber(int a){
       int x = a;
       int n = 0;
       while(x > 0){
           n = n + (x * x);
           x = x - 1;
        }
        return n;
   }
    public static String checkerboard(int w,int h){
        double wHash = 0;
        /*return new String(new char[w]).replace("\0", "-");
        for(; w > 0; w = w - 1){
           System.out.print( "-" ); 
        }
        if(w % 2 != 0){
            wHash = w / 2;
            wHash = wHash + 0.5;*/
        for(;h > 0; h--){
            System.out.print(".");
            for(;w > 0; w--){
                System.out.print(".");
            }
            System.out.print("\n");
        }
   
        return "whyyyyy";
    }
}
