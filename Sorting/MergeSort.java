
public class MergeSort
{
    public static void main(){
        int[] arr = {9, 2, 6, 4, 8, 1, 16, 7};
        //print2DArray(arr, true);
        printArray(arr, false);
    }

    public static int[][] spliter(int[] arr){        
        //first half
        int secondStart = 0;
        int[] firstHalf = new int[arr.length/2];
        for(int i = 0; i < arr.length/2; i++){
            firstHalf[i] = arr[i];
            secondStart = i;
        }    
        //second half
        if(arr.length % 2 == 0){
                int[] secondHalf = new int[secondStart + 1];
                for(int i = secondStart + 1, i2 = 0; i2 < secondHalf.length; i++, i2++){
                    secondHalf[i2] = arr[i];
                }    
                int[][] array2D = new int[][]{firstHalf, secondHalf};
                print2DArray(array2D, true);
                return array2D;}
            else{//ODD
                int[] secondHalf = new int[arr.length/2 + 1];
                for(int i = secondHalf.length - 1, i2 = 0; i2 < secondHalf.length; i++, i2++){
                    secondHalf[i2] = arr[i];
                }    
                int[][] array2D = new int[][]{firstHalf, secondHalf};
                print2DArray(array2D, true);
                return array2D;
            }
        }

        public int[] MergeSort(int[] arr){
        //base case
        if(arr.length == 1){
            return arr;
        }
        //recursive case
        int[][] array2D = spliter(arr);    
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4}; 
        return arr;
    }

    public static int[] firstHalf(int[] arr){
        int[] firstHalf = new int[arr.length/2];
        for(int i = 0; i < arr.length/2; i++){
            firstHalf[i] = arr[i];
        }    
        return firstHalf;
    }

    public static int[] secondHalf(int[] arr)
    {
        int[] secondHalf = new int[arr.length - arr.length/2];
        for(int i = secondHalf.length - 1, i2 = 0; i2 < secondHalf.length; i++, i2++){
            secondHalf[i2] = arr[i];
        }    
        return secondHalf;
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
}
