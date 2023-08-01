package PracUb;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ex6.reverse(str);

    }
    
    public String reverse (String str) {

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        return str;
    }
}
