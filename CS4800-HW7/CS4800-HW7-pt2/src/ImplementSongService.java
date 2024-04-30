import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImplementSongService implements SongService{
    private HashMap <Integer, Song> songsDatabase = new HashMap<>();

    public ImplementSongService() {
        songsDatabase = new HashMap <> ();
        songsDatabase.put(1, new Song("Payphone", "Maroon 5", "Overexposed", 280));
        songsDatabase.put(2, new Song("Vices", "Gavn!", "roots", 166));
        songsDatabase.put(3, new Song("Open Arms", "Gavn!", "Open Arms", 225));
        songsDatabase.put(4, new Song("Cruel Summer", "Taylor Swift", "Lover", 178));
        songsDatabase.put(5, new Song("London", "Mokita", "London", 166));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return songsDatabase.get(songID);
    }

    @Override
    public List <Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List <Song> searchResults = new ArrayList<>();
        for (Song song: songsDatabase.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                searchResults.add(song);
            }
        }
        return searchResults;
    }

    @Override
    public List <Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List <Song> searchResults = new ArrayList <> ();
        for (Song song: songsDatabase.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                searchResults.add(song);
            }
        }
        return searchResults;
    }
}
