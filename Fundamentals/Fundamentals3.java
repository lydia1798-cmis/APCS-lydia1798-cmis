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
        //#9
        //shift(doubleLiteralArray1, 2);
        System.out.println("\n");
        //#10
        System.out.println("#10:");
        rotate(doubleLiteralArray1);
        System.out.println("\n");
        //#11
        double [][] doubles = {
                {0.5, 0.3, 0.1},
                {0.9, 0.2, 0.8},
                {0.6, 0.4, 0.7}};
        analyze(doubles, 0.3333);
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
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                array[column][row] = value;
            }
        }
    }

    public static void initializeArray(double[][] array, double value){
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                array[column][row] = value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value){
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                array[column][row] = value;
            }
        }
    }

    public static void initializeArray(String[][] array, String value){
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                array[column][row] = value;
            }
        }
    }
    //#5 int
    public static void print2DArray(int[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int column = 0; column < array.length; column++){
                for(int row = 0; row < array[column].length; row++){
                    System.out.print(array[column][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int column = 0; column < array.length; column++){
                    System.out.print(array[column][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 double
    public static void print2DArray(double[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int column = 0; column < array.length; column++){
                for(int row = 0; row < array[column].length; row++){
                    System.out.print(array[column][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int column = 0; column < array.length; column++){
                    System.out.print(array[column][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 String
    public static void print2DArray(String[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int column = 0; column < array.length; column++){
                for(int row = 0; row < array[column].length; row++){
                    System.out.print(array[column][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int column = 0; column < array.length; column++){
                    System.out.print(array[column][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#5 Boolean
    public static void print2DArray(boolean[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int column = 0; column < array.length; column++){
                for(int row = 0; row < array[column].length; row++){
                    System.out.print(array[column][row] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            for(int row = 0; row < array.length; row++){
                for(int column = 0; column < array.length; column++){
                    System.out.print(array[column][row] + " ");
                } 
                System.out.print("\n");
            }
        }
    }
    //#6
    public static void snakePrint(int[][] arr){
        for(int column = 0; column < arr.length; column++){
            for(int row = 0, rowDecrese = arr[column].length - 1; row < arr[column].length || rowDecrese > 0; row++, rowDecrese--){
                if(column % 2 == 0){
                    System.out.print(arr[column][row] + " ");
                }
                else{
                    System.out.print(arr[column][rowDecrese] + " ");
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
        for(int column = 0; column < arr.length; column++){
            for(int row = 0; row < arr[column].length; row++){
                if(arr[column][row] .equals ("#")){
                    hashCounter1++;
                }
            }
        }
        int randomHash = (int) (Math.random() * (hashCounter1 - 1));
        for(int column = 0; column < arr.length; column++){
            for(int row = 0; row < arr[column].length; row++){
                if(arr[column][row] .equals ("#")){
                    hashCounter2++;
                }
                if(arr[column][row] .equals ("#") && hashCounter2 == randomHash){
                    arr[column][row] = Integer.toString(randomNum);
                }
            }
        }
        print2DArray(arr, true);
        return arr;
    }
    //#8
    public static int[][] replace(int[][] array, int threshold, int newValue){
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                if(array[column][row] > threshold){
                    array[column][row] = newValue;
                }
            }
        }
        print2DArray(array, true);
        return array;
    }
    //#9   (shiftrow is referring to a row index)
    public static double[][] shift(double[][] arr, int shiftRow){
        double[] shiftRowArray = new double[arr[shiftRow].length];
        for(int column = arr.length -1; column < arr.length; column--){
            if(column > shiftRow){
                arr[column] = arr[column - 1];
            }
        }

        for(int row = 0; row < arr[shiftRow].length; row++){
            shiftRowArray[row] = (double) Math.random() * 10;
        }
        arr[shiftRow] = shiftRowArray;
        print2DArray(arr, true);
        return arr;
    }
    //#10
    public static double[][] rotate(double[][] arr){
        double arr2[][] = new double[arr.length][arr[0].length];
        for(int column = 0; column < arr.length; column++){
            for(int row = 0; row < arr[column].length; row++){
                arr2[row][column] = arr[column][row];
            }
        }
        print2DArray(arr2, true);
        return arr2;
    }
    //#11
    public static boolean[][] analyze(double[][] array, double threshold){
        boolean[][] boolarr = new boolean[array.length][array[0].length];
        for(int column = 0; column < array.length; column++){
            for(int row = 0; row < array[column].length; row++){
                if(array[column][row] > threshold){
                    boolarr[column][row] = true;
                }
            }
        }
        print2DArray(boolarr, true);
        return boolarr;
    }
}
