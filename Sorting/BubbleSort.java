
/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        boolean isSorted = true;
        while(isSorted == true){
            for(int i = 0; i < array.length - 1; i++){
                int leftValue = array[i];
                int rightValue = array[i + 1];
                if(leftValue > rightValue){
                    isSorted = false;
                    array[i] = rightValue;
                    array[i + 1] = leftValue;
                }
            }
        }
    }
}
