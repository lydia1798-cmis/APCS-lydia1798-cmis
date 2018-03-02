import java.util.ArrayList;

public class carPod
{
    public static void main(){
        ArrayList<String> songLibrary = new ArrayList<String>(3);  
        songLibrary.set(0, "YET");
        MyPod pod1 = new MyPod("pink", 32, songLibrary);
        System.out.println(pod1);
    }
}