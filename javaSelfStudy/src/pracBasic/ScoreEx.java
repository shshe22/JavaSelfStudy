package pracBasic;

import java.util.Scanner;
public class ScoreEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("프로그램을 계속 진행하시겠습니까? 1. 진행 / 0. 종료");
            int process = scanner.nextInt();
            switch (process) {
                case 1:
                    System.out.println("점수를 입력하십시오.");
                    int score = scanner.nextInt();
                    if (90 <= score && score <= 100) {
                        System.out.println("A입니다");
                    } else if (80 <= score && score < 90) {
                        System.out.println("B입니다");
                    } else if (70 <= score && score < 80) {
                        System.out.println("C입니다");
                    } else {
                        System.out.println("Fail입니다");
                    }
                    break;
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    return;

            }
        }
    }
}
