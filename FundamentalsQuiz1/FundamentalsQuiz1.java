public class FundamentalsQuiz1
{
    public static void main(String[] args){
        int a = 2;
        int b = 3; 
        sumOfSquares(a, b);
        System.out.println("sumOfSquares: " + sumOfSquares(a, b));
        
        double x = 2.5;
        double y = 3.45454;
        double z = 78.9;
        average(x, y, z);
        System.out.println("average: "  + average(x, y, z));

    }
    
    public static int sumOfSquares(int a, int b){
        int aSquared = a * a;
        int bSquared = b * b;
        int sum = aSquared + bSquared;
        return sum;
        
        }
    public static double average(double x, double y, double z){
        double sum = x + y + z;
        double divide = sum / 3;
        return divide;
        
    }
    /*
     * #1 Write a method that returns the sum of the squares 
     * of 2 whole numbers given as arguments.
     * 
     * #2 Call the method from the main method. The call
     * should get its arguments from variables declared 
     * in the main method.
     */
    
    /*
     * #3 Write a method that returns the average of 3 decimals
     * given as arguments.
     * 
     * #4 Call the method from the main method. The call should get its 
     * arguments from variables declared in the main method.
     */

}