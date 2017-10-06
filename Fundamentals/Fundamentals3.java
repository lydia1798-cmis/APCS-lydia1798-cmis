public class Fundamentals3{
    //Main method
    //overloading = int double boolena and String
    public static void main(String[] args){
        int[][] intDefaultArray1 = new int[5][5];
        int[][] intLiteralArray1 = {{1, 2, 3, 4, 5},
                                    {1, 2, 3, 4, 5}, 
                                    {1, 2, 3, 4, 5}, 
                                    {1, 2, 3, 4, 5}, 
                                    {1, 2, 3, 4, 5}};
        double[][] doubleDefaultArray1 = new double[5][5];
        double[][] doubleLiteralArray1 = {{1.1, 2.2, 3.3, 4.4, 5.5}, 
                                          {1.1, 2.2, 3.3, 4.4, 5.5}, 
                                          {1.1, 2.2, 3.3, 4.4, 5.5}, 
                                          {1.1, 2.2, 3.3, 4.4, 5.5}, 
                                          {1.1, 2.2, 3.3, 4.4, 5.5}};
        String[][] checkerboardPattern = {{" ", "#", " ", "#", " ", "#", " ", "#"},
                                          {"#", " ", "#", " ", "#", " ", "#", " "},
                                          {" ", "#", " ", "#", " ", "#", " ", "#"},
                                          {"#", " ", "#", " ", "#", " ", "#", " "},
                                          {" ", "#", " ", "#", " ", "#", " ", "#"},
                                          {"#", " ", "#", " ", "#", " ", "#", " "},
                                          {" ", "#", " ", "#", " ", "#", " ", "#"},
                                          {"#", " ", "#", " ", "#", " ", "#", " "}};
        boolean[][] booleanArray = new boolean[5][5];
        setValue(intLiteralArray1, 2, 3, 92929292);
        initializeArray(intDefaultArray1, 3);
        initializeArray(doubleDefaultArray1, 3);
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
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
            array[x][y] = value;
           }
        }
        System.out.println(array[4][4]);
    }
    
    public static void initializeArray(double[][] array, double value){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
            array[x][y] = value;
           }
        }
        System.out.println(array[4][4]);
    }
    
    public static void initializeArray(boolean[][] array, boolean value){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
            array[x][y] = value;
           }
        }
        System.out.println(array[4][4]);
    }
    
    public static void initializeArray(String[][] array, String value){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
            array[x][y] = value;
           }
        }
        System.out.println(array[4][4]);
    }
}