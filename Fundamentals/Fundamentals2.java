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
        int[] arrayI2 = new int[]{1, 3, 5, 9};
        double[] arrayD = new double[]{2.5, 4.6, 6.7, 8.8, 3.9};
        boolean[] arrayB = new boolean[]{true, false, false, true, true};
        String[] arrayS = new String[]{"Tacos", "chips", "are", "really", "awesome"};

        /*boolean isSkipped = true;

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

        System.out.println("#5:");
        randomInts(6, 2, 10);
        System.out.println("\n");

        System.out.println("#6:");
        randomDoubles(6, 2.3, 10.8);
        System.out.println("\n");

        System.out.println("#7:");
        copy(arrayI);
        System.out.println("\n");

        System.out.println("#8:");
        pairs(9);
        System.out.println("\n");

        System.out.println("#9:");
        concat(arrayI, arrayI2);
        System.out.println("\n");*/

        System.out.println("#10:");
        merge(arrayI, arrayI2);
        System.out.println("\n");
    }

    public static void printArray(int array[], boolean isSkipped){
        for(int i = 0; i < array.length; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(double array[], boolean isSkipped){
        for(int i = 0; i < array.length; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(boolean array[], boolean isSkipped){
        for(int i = 0; i < array.length; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(String array[], boolean isSkipped){
        for(int i = 0; i < array.length; i++){
            if(isSkipped == true && i % 2 == 0){
                System.out.println(array[i]);
            }
            else if(isSkipped == false){
                System.out.println(array[i]);
            }
        }
    }

    public static int lastItem(int arrays[]){
        int lastIndex = arrays.length - 1;
        System.out.println(arrays[lastIndex]); 
        return arrays[lastIndex];
    }

    public static double lastItem(double arrays[]){
        int lastIndex = arrays.length - 1;
        System.out.println(arrays[lastIndex]); 
        return arrays[lastIndex];
    }

    public static boolean lastItem(boolean arrays[]){
        int lastIndex = arrays.length - 1;
        System.out.println(arrays[lastIndex]); 
        return arrays[lastIndex];
    }

    public static String lastItem(String arrays[]){
        int lastIndex = arrays.length - 1;
        System.out.println(arrays[lastIndex]); 
        return arrays[lastIndex];
    }

    public static int middleItem(int arrays[]){
        int middleIndex = arrays.length / 2;
        System.out.println(arrays[middleIndex]);
        return arrays[middleIndex];
    } 

    public static double middleItem(double arrays[]){
        int middleIndex = arrays.length / 2;
        System.out.println(arrays[middleIndex]);
        return arrays[middleIndex];
    } 

    public static boolean middleItem(boolean arrays[]){
        int middleIndex = arrays.length / 2;
        System.out.println(arrays[middleIndex]);
        return arrays[middleIndex];
    } 

    public static String middleItem(String arrays[]){
        int middleIndex = arrays.length / 2;
        System.out.println(arrays[middleIndex]);
        return arrays[middleIndex];
    } 

    public static int[] randomInts(int n, int min, int max){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = min  + (int)(Math.random() * ((max - min) + 1));
        } 
        printArray(array, false);
        return array;
    }

    public static double[] randomDoubles(int n, double min, double max){
        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            array[i] = min  + (double)(Math.random() * ((max - min) + 1));
        } 
        printArray(array, false);
        return array;
    }

    public static int[] copy(int[] array){
        int copiedArray [] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
        printArray(copiedArray, false);
        return copiedArray;
    }

    public static int[] pairs(int n){
        int[] pairs = new int[n * 2];
        for(int i = 0, value = 2; i < pairs.length; i += 2, value += 2){
            pairs[i] = value; 
            pairs[i + 1] = value;
        }
        int[] myPairs = pairs;
        printArray(myPairs, false);
        return pairs;
    }

    public static int[] concat(int[] a, int[] b){
        int combinedLength = a.length + b.length;
        int[] combinedArray = new int[combinedLength];
        for(int i = 0; i < a.length; i++){
            combinedArray[i] = a[i];
        }
        for(int i = a.length, counter = 0; i < combinedArray.length; i++, counter++){
            combinedArray[i] = b[counter];
        }
        printArray(combinedArray, false);
        return combinedArray;
    }

    public static int[] merge(int[]a, int[]b){
        int combinedLength = a.length + b.length;
        int[] finalArray = new int[combinedLength];
        int smallerArrayLength = 0;
        if(a.length < b.length){
            smallerArrayLength =+ a.length;
        }
        else{
            smallerArrayLength =+ b.length;
        }
        int alternateLength = smallerArrayLength * 2;
        int[] alternatingArray = new int[alternateLength];
        for(int i = 0; i < combinedLength; i += 1){
            for(int i2 = 0; i2 == alternateLength; i2++){
                alternatingArray[i] = a[i2];
                alternatingArray[i + 1] = b[i2];
            }
        }
         System.out.println("smallerArrayLength: " + smallerArrayLength + "\n");
            printArray(alternatingArray, false);
        return alternatingArray;
    }
}