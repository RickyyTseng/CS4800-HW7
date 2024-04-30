import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using the proxy to access song metadata
        SongService songService = new ImplementSongService();
        SongProxy songServiceProxy = new SongProxy(songService);

        // Search for songs using proxy
        Song song1 = songServiceProxy.searchById(1);
        System.out.println("Song 1: " + song1.getTitle() + " by " + song1.getArtist());

        Song song2 = songServiceProxy.searchById(2);
        System.out.println("Song 2: " + song2.getTitle() + " by " + song2.getArtist());

        Song song3 = songServiceProxy.searchById(3);
        System.out.println("Song 3: " + song3.getTitle() + " by " + song3.getArtist());

        // Search for songs by title and album using proxy
        List<Song> songsByTitle = songServiceProxy.searchByTitle("Payphone");
        System.out.println("Songs with title " + song1.getTitle() + ": " + songsByTitle.size());

        List <Song> songsByAlbum = songServiceProxy.searchByAlbum("roots");
        System.out.println("Songs in album " + song2.getAlbum() + ": " + songsByAlbum.size());
    }
}