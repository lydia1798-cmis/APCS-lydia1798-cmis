public class PeopleSimulator
{
    public static void main(){
        System.out.println("PeopleSimulator");
        Cook c = new Cook("Liz", 4, "carrots", "salt", "pepper");
        Politician p = new Politician("it", false);
        System.out.println(p);
        System.out.println(c.feed(p, "carrots"));
    }
}
