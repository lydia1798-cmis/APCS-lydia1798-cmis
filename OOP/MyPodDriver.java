import java.util.*;

public class MyPodDriver
{
    public static void main(){
        ArrayList<Song> songLibrary = new ArrayList<Song>(3);
        Song song1 = new Song("YMCA", 333, true, 2013);
        songLibrary.add(0, song1);
        Song song2 = new Song("Here Comes The Sun", 333, false, 1901);
        songLibrary.add(1, song2);
        Song song3 = new Song("Yesterday", 333, true, 2013);
        songLibrary.add(2, song3);
        MyPod carPod = new MyPod("pink", 64, songLibrary);
        System.out.println(carPod);
    }
}