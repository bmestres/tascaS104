package nivell01.exercici03;

public class Main {

    static void main(String[] args) {

        String[] songsArr = {"Levitating", "Sure thing", "The frame"};
        Playlist playlist = new Playlist(songsArr);

        String song = playlist.getNameByPos(Playlist.MAX_SONGS);
    }
}
