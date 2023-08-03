package playListMVC.model;

import playListMVC.entity.MySong;
import playListMVC.view.View;

import java.util.ArrayList;

public class SongRepository {

    static ArrayList<MySong> lists = new ArrayList<>();

    public static void add(MySong mySong) {
        lists.add(mySong);
    }

    public static void allList() {
        for (MySong allList : lists) {
            System.out.println(allList);
        }
    }

    public static void deleteAllSong() {
        lists.clear();
        View.deleteAllList();
    }

    public static MySong getSongName(String name) {
        for (MySong getSongName : lists) {
            if (getSongName.getName().equals(name)) {
                return getSongName;
            }
        }
        return null;
    }

    public static void deleteSong(String name) {
        if (getSongName(name) != null) {
            lists.remove(getSongName(name));
            View.deleteSongComplete();
        } else {
            View.noSong();
        }
    }

    public static ArrayList<MySong> findSongName(String name) {
        ArrayList<MySong> saveName = new ArrayList<>();

        for (MySong findSongName : lists) {
            if (findSongName.getName().equals(name)) {
                saveName.add(findSongName);
            }
        }

        return saveName;
    }

    public static ArrayList<MySong> findSongArtist(String artist) {
        ArrayList<MySong> saveArtist = new ArrayList<>();

        for (MySong findSongArtist : lists) {
            if (findSongArtist.getArtist().equals(artist)) {
                saveArtist.add(findSongArtist);
            }
        }

        return saveArtist;
    }


    public static ArrayList<MySong> findSongType(String type) {
        ArrayList<MySong> saveType = new ArrayList<>();

        for (MySong findSongType : lists) {
            if (findSongType.getType().equals(type)) {
                saveType.add(findSongType);
            }
        }

        return saveType;

    }

}
