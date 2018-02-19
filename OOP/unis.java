public class unis
{
    public static void main(){
        String school1 = new String ("Stanford"); 
        String school2 = new String ("Oregon"); 
        String school3 = new String ("UCLA"); 

        System.out.println(school1.compareTo(school2)); 
        System.out.println(school2.compareTo(school3));
        System.out.println(school1.compareTo(school3));
    }
}