public class ArrayMungerSol
{
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] r = munge(a, b);
        for(int i: r){
            System.out.println(i);
        }
    }
    /**
     * Write a method that takes 2 integer arrays as arguments.
     * It should return the the array for which the sum of the first, last, and middle values is the greatest.
     * If the sum is equal, it should return an array that contains the sum of the first values, 
     * the sum of the middle values, and the sum of the last values.
     */
    public static int[] munge(int[] arr1, int[] arr2){
        int sumArr1 = arr1[0] + arr1[arr1.length/2] + arr1[arr1.length-1];
        int sumArr2 = arr2[0] + arr2[arr2.length/2] + arr2[arr2.length-1];
        int sumFirst = arr1[0] + arr2[0];
        int sumMiddle = arr1[arr1.length/2] + arr2[arr2.length/2];
        int sumLast = arr1[arr1.length-1] + arr2[arr2.length-1];
        if(sumArr1 == sumArr2){
            int[] sumEqual = new int[]{sumFirst, sumMiddle, sumLast};
            return sumEqual;
        }
        else if(sumArr1 > sumArr2){
            return arr1;
        }
        else{
            return arr2;
        }
    }
}
//10 POINTS