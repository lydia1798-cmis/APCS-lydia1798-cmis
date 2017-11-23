public class stringy{
    public static void main(String[] args){
        System.out.println(stringy("(-_-) ", 5));
    }
    //return sym a certain # of times
    public static String stringy(String sym, int times){
        //Base case is when times = 0
        if(times == 0){
            return "";
        }
        else{
            return sym + stringy(sym, times - 1);           
        }
    }
}