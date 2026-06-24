package nivell01.exercici03;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public static final int MAX_SONGS = 2;
    private String[]songs;

    public Playlist(String[]songs){
        this.songs = songs;
    }

    public String getNameByPos(int pos){
        return this.songs[pos];
    }
}
