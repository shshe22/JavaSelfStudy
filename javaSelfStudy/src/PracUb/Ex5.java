package PracUb;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Ex5 ex5 = new Ex5();
        ex5.chUp(str);
    }

    public String chUp (String str) {
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);

            if (97<=arr[i] && 122>=arr[i]) {
                System.out.print((char)(arr[i]-32));
            }

        }

        return str;
    }
}
