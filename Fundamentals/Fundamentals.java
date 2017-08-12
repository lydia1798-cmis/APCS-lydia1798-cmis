
public class Fundamentals

{

    public static void main (String[] args){
        dataTypes();
    }

    public static void dataTypes(){
        System.out.println( "dataTypes:\n" );

        byte byteExample = 58;
        System.out.println( "byte: " + byteExample);
        String byteDescription = "Byte is a primitive data type that is an 8-bit signed two component integer type. \nIt has a minimum value of -128 and a maximum value of 127 and is ussually used to save memory.";
        System.out.println( "Description: " + byteDescription + "\n");

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
}
