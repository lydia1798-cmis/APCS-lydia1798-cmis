public class TacoDriver
{
    public static void main(){
        Taco taco1 = new Taco();
        System.out.println(taco1);
        Taco taco2 = new Taco("guacamole", "sour cream", true);        
        System.out.println(taco2);
        System.out.println(taco1.healthy("CHEESE", "spinach"));
        taco1.combineToppings("chicken ", "sour cream");
        System.out.println(taco1);
    }
}
