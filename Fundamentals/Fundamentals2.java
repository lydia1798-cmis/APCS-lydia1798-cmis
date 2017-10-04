public class Fundamentals2
{
    //Different data type (overloading): int, boolean, double & String
    public static void main(String[] args){
        System.out.println("#1:");
        int[] intArray = new int[]{2, 3, 5, 7, 11};
        double[] doubleArray = new double[]{2.3, 4.5, 6.7, 8.8, 3.9};
        String[] stringArray = new String[]{"rainbows", "unicorns", "ice cream cones", "sprinkles", "tacos"};
        System.out.println(intArray[0] + "\n" + doubleArray[2] + "\n" + stringArray[4] + "\n");

        System.out.println("#2:");
        int[] arrayI = new int[]{2, 4, 6, 8, 6, 7, 9, 2};
        int[] arrayI2 = new int[]{1, 3, 5, 9};
        int[] arrayI3 = new int[]{4, 2, 7, 6};
        double[] arrayD = new double[]{2.5, 4.6, 6.7, 8.8, 3.9};
        double[] arrayD2 = new double[]{1.7, 6.8, 3.3};
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

        System.out.println("#5:");
        randomInts(6, 2, 10);
        System.out.println("\n");

        System.out.println("#6:");
        randomDoubles(6, 2.3, 10.8);
        System.out.println("\n");

        System.out.println("#7:");
        copy(arrayI);
        System.out.println("\n");
        copy(arrayD);
        System.out.println("\n");
        copy(arrayB);
        System.out.println("\n");
        copy(arrayS);
        System.out.println("\n");

        System.out.println("#8:");
        pairs(9);
        System.out.println("\n");

        System.out.println("#9:");
        concat(arrayI, arrayI2);
        System.out.println("\n");

        System.out.println("#10:");
        merge(arrayI, arrayI2);
        System.out.println("\n");

        System.out.println("#11:");
        reverse(arrayI);
        System.out.println("\n");

        System.out.println("#12:");
        subArray(arrayI, 2, 5);
        System.out.println("\n");

        System.out.println("#13:");
        compareArrays(arrayI3, arrayI2);
        System.out.println("\n");

        System.out.println("#14:");
        minimize(arrayI, 3);
        System.out.println("\n");
        
        System.out.println("#15:");
        maximize(arrayI, 5);
        System.out.println("\n");
        
        System.out.println("#16:");
        maxMerge(arrayD, arrayD2);
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
        return copiedArray;
    }
    
    public static double[] copy(double[] array){
        double[] copiedArray = new double[array.length];
        for(int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
    
    public static boolean[] copy(boolean[] array){
        boolean[] copiedArray = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
    
    public static String[] copy(String[] array){
        String[] copiedArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
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
        int[] longerArray;
        if(a.length < b.length){
            smallerArrayLength = a.length;
            longerArray = b;
        }
        else{
            smallerArrayLength = b.length;
            longerArray = a;
        }
        int alternateLength = (smallerArrayLength * 2) - 1;
        int difference = combinedLength - alternateLength;
        for(int i = 0, i2 = 0; i < smallerArrayLength; i++, i2 += 2){
            finalArray[i2] = a[i];
            finalArray[i2 + 1] = b[i];
        }
        for(int i3 = smallerArrayLength, i4 = alternateLength + 1; i3 < longerArray.length; i3++, i4++){
            finalArray[i4] = longerArray[i3];
        }
        printArray(finalArray, false);
        return finalArray;
    }

    public static void reverse(int[] array){
        int[] copyArray = copy(array);
        for(int i = 0, i2 = array.length - 1; i < array.length && i2 > -1; i++, i2--){
            copyArray[i] = array[i2];
        }
        array = copyArray;
        printArray(array, false);
    }

    public static int[] subArray(int[] array, int start, int stop){
        int range = (stop - start) + 2;
        int[] finalArray = new int[range];
        for(int i = 0, i2 = start; i < stop; i++, i2++){
            finalArray[i] = array[i2];
        }
        printArray(finalArray, false);
        return finalArray;
    }

    public static int[] compareArrays(int[] a, int[] b){
        int aLength = 0;
        int bLength = 0;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > b[i]){
                aLength++;
            }
            else{
                bLength++;
            }
        }
        if(aLength > bLength){
            printArray(a, false);
            return a;
        }
        else{
            printArray(a, false);
            return b;
        }
    }

    public static int[] minimize(int[] array, int threshold){
        int[] newArray = copy(array);
        for(int i = 0; i < array.length; i++){
            if(newArray[i] > threshold){
                newArray[i] = threshold;
            }
        }
        printArray(newArray, false);
        return newArray;
    }

    public static void maximize(int[] array, int threshold){
        for(int i = 0; i < array.length; i++){
            if(array[i] < threshold){
                array[i] = threshold;
            }
        }
        printArray(array, false);
    }
    
    public static double[] maxMerge(double[] a, double[] b){
        int greaterLength = 0;
        int smallerLength = 0;
        if(a.length > b.length){
            greaterLength = a.length;
            smallerLength = b.length;
        }
        else{
            greaterLength = b.length;
            smallerLength = a.length;
        }
        double[] finalArray = new double[greaterLength];
        for(int i = 0; i < smallerLength; i++){
            if(a[i] > b[i]){
                finalArray[i] = a[i];
            }
            else{
                finalArray[i] = b[i];
            }
        }
        for(int i = 0; i < finalArray.length; i++){
            if(a.length > b.length){
                finalArray[i] = a[i];
            }
            else{
                finalArray[i] = b[i];
            }
        }
        printArray(finalArray, false);
        return finalArray;
    }
}