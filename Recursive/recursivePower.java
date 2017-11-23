//Two arguments - (n, x): n has to be to the power of x
public class recursivePower
{
    public static void main(String[] arg){
         System.out.println(power(2, 2));
    }

    public static int power(int n, int x){
        //base case
        if(x == 0){
            return 1;
        }
        //recursive case
        else{
            return n * power(n, x - 1); //the value of the recursive call is what it returned last time
        }        
    }
}
