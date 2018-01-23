public class Hamster
{
    private String name = "Squeaks";
    private int numSeedsPerDay = 9;
    private double size = 3.4;
    private boolean isCute = true;

    public Hamster(String name, double size){
        this.name = name;
        if(size < 2){
            this.size = 2;
        }
        else{
            this.size = size;
        }
    }

    public Hamster(boolean isCute, String name, int numSeedsPerDay){
        this.isCute = isCute;
        if(!name.substring(0, 1).equals ("L")){
            this.name = "Squeaks";
        }
        else{
            this.name = name;
        }
        this.numSeedsPerDay = numSeedsPerDay + 2;
    }
    
    
}