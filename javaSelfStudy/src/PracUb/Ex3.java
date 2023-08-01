package PracUb;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(ex3.add(n));
    }

    int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
