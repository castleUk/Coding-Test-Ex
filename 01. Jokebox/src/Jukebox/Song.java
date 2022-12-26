package Jukebox;

public class Song {
    private final String title;
    private final CD cd;

    public Song(String title, CD cd){
        this.title = title;
        this.cd = cd;
    }

    public CD getCd(){
        return cd;
    }
    public String getTitle(){
        return title;
    }

}
