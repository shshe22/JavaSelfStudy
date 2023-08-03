package playListMVC.view;

import playListMVC.controller.Controller;
import playListMVC.entity.MySong;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    static Scanner sc = new Scanner(System.in);

    public static void startPlayList() {
        System.out.println();
        System.out.println("       < 나만의 플레이 리스트 🎧 >       ");
        System.out.println();
    }

    public static int playListMenu() {
        System.out.println("* 메뉴 리스트");
        System.out.println("🎵 1. 플레이 리스트에 노래를 추가합니다.");
        System.out.println("🎵 2. 플레이 리스트 목록을 불러옵니다.");
        System.out.println("🎵 3. 플레이 리스트에 노래를 삭제합니다");
        System.out.println("🎵 4. 플레이 리스트 내의 노래를 검색합니다.");
        System.out.println("🎵 0. 플레이 리스트를 종료합니다.");
        System.out.println("======================================");

        System.out.println("* 메뉴 번호를 입력하십시오.");
        int menu = sc.nextInt();
        System.out.println("======================================");

        return menu;
    }

    public static void turnOff() {
        System.out.println("안녕 ~ 다음에 또 만나용 🖐️");
    }

    public static void restartMenu() {
        System.out.println("⚠️ 메뉴를 다시 선택해주십시오. ");
    }

    public static String addListName() {
        System.out.println("🎼 플레이 리스트에 추가할 곡명을 입력해주세요. ");
        sc.nextLine();
        String name = sc.nextLine();

        return name;
    }

    public static String addListArtist() {
        System.out.println("🎤 해당 곡의 가수 이름을 입력해주세요. ");
        String artist = sc.nextLine();

        return artist;
    }

    public static String addListType() {
        System.out.println("🎹 해당 곡의 장르를 입력해주세요. ");
        String type = sc.nextLine();
        return type;
    }

    public static void addListSong() {
        System.out.println(Controller.addList());
        System.out.println("❗ 플레이 리스트에 곡이 추가 되었습니다. ");
        System.out.println("======================================");
    }

    public static void showAllList() {
        System.out.println("📑 저장된 플레이 리스트를 불러옵니다. ");
        System.out.println();
    }

    public static int deleteMenu() {
        System.out.println("🗑️ 플레이 리스트에서 삭제하고싶은 옵션을 선택해주세요. ");
        System.out.println("1. 전체 플레이 리스트 삭제");
        System.out.println("2. 플레이 리스트 내의 곡 삭제");

        int choice = sc.nextInt();
        System.out.println("======================================");
        return choice;
    }

    public static void deleteAllList() {
        System.out.println();
        System.out.println("❗ 전체 플레이 리스트가 삭제 되었습니다. ");
    }

    public static String deleteSongName() {
        System.out.println("🗑️ 플레이 리스트에서 삭제하고 싶은 곡명을 입력해주세요. ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println();

        return name;
    }

    public static void deleteSongComplete() {
        System.out.println("❗ 해당 곡이 삭제 되었습니다. ");
    }

    public static int searchList() {
        System.out.println("🔎 플레이 리스트에서 검색하고 싶은 옵션을 선택해주세요. ");
        System.out.println("1. 곡명으로 검색");
        System.out.println("2. 가수명으로 검색");
        System.out.println("3. 장르로 검색");

        int choice = sc.nextInt();
        System.out.println("======================================");
        sc.nextLine();

        return choice;
    }

    public static String searchListName() {
        System.out.println("🏷️ 곡명을 입력하세요.");
        String name = sc.nextLine();
        System.out.println();

        return name;
    }

    public static String searchListArtist() {
        System.out.println("🏷️ 가수를 입력하세요.");
        String artist = sc.nextLine();
        System.out.println();

        return artist;
    }

    public static String searchListType() {
        System.out.println("🏷️ 장르를 입력하세요.");
        String type = sc.nextLine();
        System.out.println();

        return type;
    }

    public static void searchNameIf(ArrayList<MySong> saveName) {
        if(saveName.size() != 0) {
            for(MySong saveNameList : saveName) {
                System.out.println(saveNameList);
            }
        } else {
            View.noSong();
        }
    }

    public static void searchArtistIf(ArrayList<MySong> saveArtist) {
        if(saveArtist.size() != 0) {
            for(MySong saveArtistList : saveArtist) {
                System.out.println(saveArtistList);
            }
        } else {
            View.noSong();
        }
    }

    public static void searchTypeIf(ArrayList<MySong> saveType) {
        if(saveType.size() != 0) {
            for(MySong saveTypeList : saveType) {
                System.out.println(saveTypeList);
            }
        } else {
            View.noSong();
        }
    }

    public static void noSong() {
        System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
    }

    public static void line() {
        System.out.println("======================================");
    }

    public static void enter() {
        System.out.println();
    }
}
