public class SongDriver{
    public static void main(){
        Song song1 = new Song();
        Song song2 = new Song("Free Fallin'", 340, true, 1999);
        System.out.println(song1);
        System.out.println(song1.getYearReleased());
        song2.setYearReleased(1984);
        System.out.println(song2);
    }
}