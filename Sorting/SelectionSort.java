public class SelectionSort
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
        //going to need 2 variables in order to switch
        int lowest = 0;
        int lowestIndex = 0;
        //outer loop to switch and reasign values
        for(int i = 0; i < array.length; i++){
            //finding the lowest value
            lowest = array[i];
            for(int i2 = i; i2 < array.length; i2++){
                if(lowest > array[i2]){
                    lowest = array[i2];
                    lowestIndex = i2;
                }
            }
            int store = array[i];
            array[i] = lowest;
            array[lowestIndex] = store;
        }
    }
}