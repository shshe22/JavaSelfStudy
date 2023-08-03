package playListMVC.controller;

import playListMVC.entity.MySong;
import playListMVC.model.SongRepository;
import playListMVC.view.View;

public class Controller {
//    View view;
//    SongRepository songRepo;
//
//    Controller() {
//        this.view = new View();
//        this.songRepo = new SongRepository();
//    }
// m(repo) 데이터 가공 및 관리, c m(repo)과 view 연결, v 입출력
    
    
    public void run() {

        View.startPlayList();

        while (true) {

            switch (View.playListMenu()) {
                case 1:
                    View.addListSong();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    deleteList();
                    break;
                case 4:
                    searchList();
                    break;
                case 0:
                    View.turnOff();
                    return;
                default:
                    View.restartMenu();
            }

        }
    }


    public static String addList() {
        MySong mySong = new MySong();

        mySong.setName(View.addListName());
        mySong.setArtist(View.addListArtist());
        mySong.setType(View.addListType());

        SongRepository.add(new MySong(mySong.getName(), mySong.getArtist(), mySong.getType()));

        View.enter();

        return String.valueOf(mySong);
    }

    private static void showList() {
        View.showAllList();
        SongRepository.allList();
        View.line();
    }

    private static void deleteList() {

        switch (View.deleteMenu()) {
            case 1:
                SongRepository.deleteAllSong();
                break;
            case 2:
                SongRepository.deleteSong(View.deleteSongName());
                break;
            default:
                View.restartMenu();
                break;
        }

        View.line();
    }

    private static void searchList() {

        switch (View.searchList()) {
            case 1:
                View.searchNameIf(SongRepository.findSongName(View.searchListName()));
                break;
            case 2:
                View.searchArtistIf(SongRepository.findSongArtist(View.searchListArtist()));
                break;
            case 3:
                View.searchTypeIf(SongRepository.findSongType(View.searchListType()));
                break;
            default:
                View.restartMenu();
                break;
        }

        View.line();
    }

}
