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
        int first = 0;
        int lowestIndex = array[0];
        //outer loop to switch and reasign values
        for(int i = first; i < array.length; i++){
            //finding the lowest value
            for(int i2 = first; i2 < array.length; i2++){
                if(array[i2] < array[lowestIndex]){
                    lowestIndex = i2;
                }
            }
            //assigning the lowest value to go to the front
            //lowestValue = array[lowestIndex];
            //firstValue = 
            array[i] = array[lowestIndex];
            first = i;
        }
    }
}