package exercici03;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PlaylistTest {

    @Test
    void wrongAccessThrowsException(){
        String[] songsArr = {"Levitating", "Sure thing", "The frame"};
        Playlist playlist = new Playlist(songsArr);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {String song = playlist.getNameByPos(Playlist.MAX_SONGS + 1);});
    }
}
