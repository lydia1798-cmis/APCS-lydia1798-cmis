public class TacoDriver
{
    public static void main(){
        Taco taco1 = new Taco();
        System.out.println(taco1);
        Taco taco2 = new Taco("guacamole", "sour cream", true);        
        System.out.print(taco2);
        taco1.setTopping1("lettuce");
        System.out.println(taco1.getTopping1());
        System.out.println(taco1);
    }
}
