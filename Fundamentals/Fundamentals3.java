public class Fundamentals3{
    //Main method
    //overloading = int double boolena and String
    public static void main(String[] args){
        int[][] intDefaultArray1 = new int[5][5];
        int[][] intLiteralArray1 = {
                {1, 2, 3, 4, 5},
                {4, 6, 2, 9, 3}, 
                {8, 45, 0, 2, 8, 5}, 
                {34, 2, 7, 3, 6, 8, 8, 8, 8}, 
                {7, 6, 90, 6, 4}};
        double[][] doubleDefaultArray1 = new double[5][5];
        double[][] doubleLiteralArray1 = {
                {1.1, 2.2, 3.3, 4.4, 5.5}, 
                {1.1, 2.2, 3.3, 4.4, 5.5}, 
                {1.1, 2.2, 3.3, 4.4, 5.5}, 
                {1.1, 2.2, 3.3, 4.4, 5.5}, 
                {1.1, 2.2, 3.3, 4.4, 5.5}};
        String[][] checkerboardPattern = {
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "}};

        boolean[][] booleanArray = new boolean[5][5];
        //#3
        //setValue(intLiteralArray1, 2, 3, 92929292);
        //#4
        initializeArray(intDefaultArray1, 3);
        initializeArray(doubleDefaultArray1, 3);
        initializeArray(booleanArray, true);
        //initializeArray(checkerboardPattern, "-_-");
        //#5
        //print2DArray(intLiteralArray1, false);
        //#6
        snakePrint(intLiteralArray1);
        System.out.println("7: \n");
        //#7
        //String s = "lol";
        //s.equals("lol");
        locate(checkerboardPattern);
        System.out.print("\n");
        //#8
        replace(intLiteralArray1, 80, 13);
    }

    public static void setValue(int[][] arr, int r, int c, int v){
        arr[r][c] = v;
        System.out.println(arr[r][c]);
    }

    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c] = v;
        System.out.println(arr[r][c]);
    }

    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c] = v;
        System.out.println(arr[r][c]);
    }

    public static void initializeArray(int[][] array, int value){
        for(int collum = 0; collum < array.length; collum++){
            for(int row = 0; row < array[collum].length; row++){
                array[collum][row] = value;
            }
        }
    }

    public static void initializeArray(double[][] array, double value){
        for(int collum = 0; collum < array.length; collum++){
            for(int row = 0; row < array[collum].length; row++){
                array[collum][row] = value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value){
        for(int collum = 0; collum < array.length; collum++){
            for(int row = 0; row < array[collum].length; row++){
                array[collum][row] = value;
            }
        }
    }

    public static void initializeArray(String[][] array, String value){
        for(int collum = 0; collum < array.length; collum++){
            for(int row = 0; row < array[collum].length; row++){
                array[collum][row] = value;
            }
        }
    }
    //#5 int
    public static void print2DArray(int[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int collum = 0; collum < array.length; collum++){
                for(int row = 0; row < array[collum].length; row++){
                    System.out.print(array[collum][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int collum = 0; collum < array.length; collum++){
                    System.out.print(array[collum][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 double
    public static void print2DArray(double[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int collum = 0; collum < array.length; collum++){
                for(int row = 0; row < array[collum].length; row++){
                    System.out.print(array[collum][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int collum = 0; collum < array.length; collum++){
                    System.out.print(array[collum][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 String
    public static void print2DArray(String[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int collum = 0; collum < array.length; collum++){
                for(int row = 0; row < array[collum].length; row++){
                    System.out.print(array[collum][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int collum = 0; collum < array.length; collum++){
                    System.out.print(array[collum][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 Boolean
    public static void print2DArray(boolean[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int collum = 0; collum < array.length; collum++){
                for(int row = 0; row < array[collum].length; row++){
                    System.out.print(array[collum][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int collum = 0; collum < array.length; collum++){
                    System.out.print(array[collum][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }

    public static void snakePrint(int[][] arr){
        for(int collum = 0; collum < arr.length; collum++){
            for(int row = 0, rowDecrese = arr[collum].length - 1; row < arr[collum].length || rowDecrese > 0; row++, rowDecrese--){
                if(collum % 2 == 0){
                    System.out.print(arr[collum][row] + " ");
                }
                else{
                    System.out.print(arr[collum][rowDecrese] + " ");
                }
            }
            System.out.print("\n");
        }
    }
    // #7
    public static String[][] locate(String[][] arr){
        //1)Go through all of the hashes and count them
        //2)Go through all of the hashes again and have 1 random number (of the hashes).
        int hashCounter1 = 0;
        int hashCounter2 = 0;
        int randomNum = (int) (Math.random() * 9);
        for(int collum = 0; collum < arr.length; collum++){
            for(int row = 0; row < arr[collum].length; row++){
                if(arr[collum][row] .equals ("#")){
                    hashCounter1++;
                }
            }
        }
        int randomHash = (int) (Math.random() * (hashCounter1 - 1));
        for(int collum = 0; collum < arr.length; collum++){
            for(int row = 0; row < arr[collum].length; row++){
                if(arr[collum][row] .equals ("#")){
                    hashCounter2++;
                }
                if(arr[collum][row] .equals ("#") && hashCounter2 == randomHash){
                    arr[collum][row] = Integer.toString(randomNum);
                }
            }
        }
        print2DArray(arr, true);
        return arr;
    }

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for(int collum = 0; collum < array.length; collum++){
            for(int row = 0; row < array[collum].length; row++){
                if(array[collum][row] > threshold){
                    array[collum][row] = newValue;
                }
            }
        }
        print2DArray(array, true);
        return array;
    }

}
