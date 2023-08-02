package playListMVC.controller;

import playListMVC.entity.MySong;
import playListMVC.model.SongRepository;
import playListMVC.view.View;

import java.util.Vector;

public class Controller {

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
                View.deleteAllList();
                break;
            case 2:
                SongRepository.deleteSong(View.deleteSongName());

                if() {
                    View.deleteSongComplete();
                } else {
                    View.noSong();
                }

                break;
            default:
                View.restartMenu();
                break;
        }

        View.line();
    }

    private static void searchList() {

//        System.out.println("🔎 플레이 리스트에서 검색하고 싶은 옵션을 선택해주세요. ");
//        System.out.println("1. 곡명으로 검색");
//        System.out.println("2. 가수명으로 검색");
//        System.out.println("3. 장르로 검색");
//
//        int choice = sc.nextInt();
//        System.out.println("======================================");
//        sc.nextLine();
//
//        switch (choice) {
//            case 1:
//                System.out.println("🏷️ 곡명을 입력하세요.");
//                String name = sc.nextLine();
//                System.out.println();
//                int cnt1 = 0;
//
//                for (Song song : lists) {
//                    if (song.getName().equals(name)) {
//                        System.out.println(song);
//                        cnt1++;
//                    }
//                }
//
//                if (cnt1 == 0) {
//                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
//                }
//
//                break;
//            case 2:
//                System.out.println("🏷️ 가수를 입력하세요.");
//                String artist = sc.nextLine();
//                System.out.println();
//                int cnt2 = 0;
//
//                for (Song song : lists) {
//                    if (song.getArtist().equals(artist)) {
//                        System.out.println(song);
//                        cnt2++;
//                    }
//                }
//
//                if (cnt2 == 0) {
//                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
//                }
//                break;
//            case 3:
//                System.out.println("🏷️ 장르를 입력하세요.");
//                String type = sc.nextLine();
//                System.out.println();
//                int cnt3 = 0;
//
//                for (Song song : lists) {
//                    if (song.getType().equals(type)) {
//                        System.out.println(song);
//                        cnt3++;
//                    }
//                }
//
//                if (cnt3 == 0) {
//                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
//                }
//                break;
//            default:
//                System.out.println("⚠️ 메뉴를 다시 선택해주십시오. ");
//                break;
//        }
//
//        System.out.println("======================================");
    }
}
