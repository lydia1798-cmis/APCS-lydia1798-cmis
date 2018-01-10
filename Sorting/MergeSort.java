
public class MergeSort
{
    public static void main(){
        int[] arr = {9, 2, 6, 4, 8, 1, 16, 7, 2}; 
        printArray(secondHalf(arr), false);
    }

    /*public int[] MergeSort(int[] arr)
    {
    //base case
    if(arr.length == 1){
    return arr;
    }
    //recursive case
    int[] arr1 = {1, 2};
    int[] arr2 = {3, 4}; 
    return 
    }*/

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
        for(int i = secondHalf.length; i < arr.length; i++){
            secondHalf[i - secondHalf.length] = arr[i];
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
}
