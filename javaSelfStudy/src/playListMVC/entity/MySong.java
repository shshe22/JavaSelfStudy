package playListMVC.entity;

public class MySong {
    private String name;
    private String artist;
    private String type;

    public MySong(){
    }

    public MySong(String name, String artist, String type){
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "💿 " + name + " [" + artist + "]  _" + type;
    }
}
