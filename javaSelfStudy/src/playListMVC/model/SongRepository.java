package playListMVC.model;

import playListMVC.entity.MySong;

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
        lists.remove(getSongName(name));
    }

}
