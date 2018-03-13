import java.util.*;

public class Family
{
    List<String> myFamily = new ArrayList<String>();

    public static void main(){
        Family ritchies = new Family();
        System.out.println(ritchies);        
        //System.out.println(ritchies.myFamily.size());
    }
    //populating ArrayList
    public Family(){
        myFamily.add("Mom");
        myFamily.add("Dad");
        myFamily.add("Miriam");
        myFamily.add("Lydia");
        myFamily.add("Rascal");
        myFamily.add("Scout");
    }

    public String toString(){
        String out = "";
        //normal for loop works
        /*for(int i = 0; i < myFamily.size(); i++){
            out += myFamily.get(i) + "\n";
        }*/
        for(String name: myFamily){
            out += name + "\n";
        }
        return out;
    }
}