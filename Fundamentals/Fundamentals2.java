public class Fundamentals2
{
    /*Different data type (overloading): int, boolean, double & String*/
    public static void main(String[] args){
        System.out.println("#1:");
        int[] intArray = new int[]{2, 3, 5, 7, 11};
        double[] doubleArray = new double[]{2.3, 4.5, 6.7, 8.8, 3.9};
        String[] stringArray = new String[]{"rainbows", "unicorns", "ice cream cones", "sprinkles", "tacos"};
        System.out.println(intArray[0] + "\n" + doubleArray[2] + "\n" + stringArray[4] + "\n");

        System.out.println("#2:");
        int[] arrayI = new int[]{2, 4, 6, 8, 3};
        double[] arrayD = new double[]{2.5, 4.6, 6.7, 8.8, 3.9};
        boolean[] arrayB = new boolean[]{true, false, false, true, true};
        String[] arrayS = new String[]{"Tacos", "chips", "are", "really", "awesome"};
        
        boolean isSkipped = true;
        
        printArray(arrayI, isSkipped);
        System.out.print("\n");
        printArray(arrayD, isSkipped);
        System.out.print("\n");
        printArray(arrayB, isSkipped);
        System.out.print("\n");
        printArray(arrayS, isSkipped);
        System.out.print("\n");
        
        System.out.println("#3:");
        lastItem(arrayI);
        lastItem(arrayD);
        lastItem(arrayB);
        lastItem(arrayS);
        System.out.println("\n");
        
        System.out.println("#4:");
        middleItem(arrayI);
        middleItem(arrayD);
        middleItem(arrayB);
        middleItem(arrayS);
        System.out.println("\n");
    }

    public static void printArray(int array[], boolean isSkipped){
        for(int i = 0; i < 5; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(double array[], boolean isSkipped){
        for(int i = 0; i < 5; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(boolean array[], boolean isSkipped){
        for(int i = 0; i < 5; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }
    
    public static void printArray(String array[], boolean isSkipped){
        for(int i = 0; i < 5; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static int lastItem(int arrays[]){
        System.out.println(arrays[4]);
        return arrays[4]; 
    }
    
    public static double lastItem(double arrays[]){
        System.out.println(arrays[4]);
        return arrays[4]; 
    }
    
    public static boolean lastItem(boolean arrays[]){
        System.out.println(arrays[4]);
        return arrays[4]; 
    }
    
    public static String lastItem(String arrays[]){
        System.out.println(arrays[4]);
        return arrays[4]; 
    }
    
    public static int middleItem(int arrays[]){
        System.out.println(arrays[2]);
        return arrays[2]; 
    }
    
    public static double middleItem(double arrays[]){
        System.out.println(arrays[2]);
        return arrays[2]; 
    }
    
    public static boolean middleItem(boolean arrays[]){
        System.out.println(arrays[2]);
        return arrays[2]; 
    }
    
    public static String middleItem(String arrays[]){
        System.out.println(arrays[2]);
        return arrays[2]; 
    }
    
    public static int[] randomInts(int n, int min, int max){
        int[] array = new int[n];
        math.random()
        return array(n);
    }
}
