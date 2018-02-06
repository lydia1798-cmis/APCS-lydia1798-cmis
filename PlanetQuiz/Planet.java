public class Planet
{
    private String name;
    private double diameter;
    private int moons;
    private boolean hasRings;

    public Planet(){
        double intName = Math.random();        
        this.name = "Planet " + intName;
        this.diameter = Math.random() * (100.0 - 5.0);        
        this.moons =  (int) Math.floor(Math.random() * (10 - 0)) + 0;
        int prob = (int) Math.floor(Math.random() * (4 - 1)) + 1;
        if(prob == 1 || prob == 2 || prob == 3){
            this.hasRings = true;
        }
        else{
            this.hasRings = false;
        }
    }
    
    public Planet(String name, double diameter, int moons, boolean hasRings){
        if(name == "Alderaan"){
            this.name = "The shattered remains of Alderaan.";
        }
        else{
            this.name = name;
        }
        if(diameter < 5 || diameter > 100){
            this.diameter = 5;
        }
        else{
            this.diameter = diameter;
        }
        if(moons < 0 || moons > 10){
            this.moons = 0;
        }
        else{
            this.moons = moons;
        }
        if(this.moons == 0){
            this.hasRings = true;
        }
        else{
            this.hasRings = false;
        }
    }
    
    public String toString(){
        String out = "";
        out += "Name: " + name;
        out += "\nDiameter: " + diameter;
        out += "\nNumber of Moons: " + moons;
        if(hasRings == true){
            out += "\nHas rings.\n";
        }
        else{
            out += "\nDoesn't have rings.\n";
        }
        return out;
    }

    public static void main(String[] args){
        Planet p1 = new Planet();
        System.out.println(p1);
        System.out.println();

        Planet p2 = new Planet();
        System.out.println(p2);
        System.out.println();

        Planet p3 = new Planet("Tatooine", -100.0, 35, true);
        System.out.println(p3);
        System.out.println();

        Planet p4 = new Planet("Alderaan", 35.234234, 2, false);
        System.out.println(p4);
        System.out.println();

        Planet p5 = new Planet("Endor", 12.234234, 2, true);
        System.out.println(p5);
        System.out.println();

        Planet p6 = new Planet("Dagoba", 85.4, 0, true);
        System.out.println(p6);
        System.out.println();

    }

    /*  
    The 0 argument constructor should produce a random planet with the following specs:
     * Name: "Planet 0.9282578767189511" <--  0.0 to  1.0
     * 5.0 to 100.0 diameter
     * 0 to 10 moons
     * 75 percent of planets have rings.
    The 4 argument constructor should produce a planet according to the following rules:
     * Any name except for "Alderaan" will be accepted.
    Any attempt to name a planet "Alderaan" will result in the planet being called "The shattered remains of Alderaan".
     * The radius must be set to a value from 5 to 100. 
    Any attempt to set it to a value outside of that range will result in a value of 5.
     * The number of moons must be set a value from 0 to 10.
    Any attempt to set it to a value outside of that range will result in a value of 0.
     * The planet may only have rings if its number of moons is set to 0.
    Sample Output
    =============
    Name: Planet 0.2146132101743311
    Radius: 68.39386611177189 
    Number of moons: 1
    Doesn't have rings.
    Name: Planet 0.4976143106602622
    Radius: 48.12822187896819 
    Number of moons: 2
    Has rings.
    Name: Tatooine
    Radius: 5.0 
    Number of moons: 0
    Has rings.
    Name: The shattered remains of Alderaan
    Radius: 35.234234 
    Number of moons: 2
    Doesn't have rings.
    Name: Endor
    Radius: 12.234234 
    Number of moons: 2
    Doesn't have rings.
    Name: Dagoba
    Radius: 85.4 
    Number of moons: 0
    Has rings.
     */
}