import java.util.*;

public abstract class MyDevice
{
    private String type;
    private int memory;
     
    public MyDevice(){
        this.type = "phone";
        this.memory = 32;
    }
    
    public MyDevice(String type, int memory){
        this.type = type;
        this.memory = memory;
    }
    
    public String toString(){
        String out = "";
        out += "Type: " + this.type;
        out += "Memory: " + this.memory;
        return out;
    }
}