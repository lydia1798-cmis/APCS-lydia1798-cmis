import java.util.*;

public class Cook extends Person
{
    public List<String> ingredients = new ArrayList();   
    private int numOfHats = 0;

    public Cook(String name, int numOfHats, String in1, String in2, String in3){
        super(name);
        this.numOfHats = numOfHats;
        ingredients.add(in1);
        ingredients.add(in2);
        ingredients.add(in3);
    }        

    public boolean feed(Politician p, String food){
        boolean success = false;
        if(cook(food) == true){
            success = p.eat(food);            
        }
        return success;
    }

    public String getIngredients(int i){
        return ingredients.get(i);
    }

    public boolean eat(String food){
        boolean success = false;
        if(food.equals("burriots")){
            setLifeForce(100000000.2);
            success = true;
        }
        else{
            setLifeForce(0.1);            
        }
        return success;
    }

    public boolean cook(String food){
        boolean success = false;
        if(food.equals(ingredients.get(0))||food.equals(ingredients.get(1))||food.equals(ingredients.get(2))){
            String out = "I just cooked " + food + "!!!\n";
            System.out.println(out);
            success = true;
        }
        return success;        
    }
}