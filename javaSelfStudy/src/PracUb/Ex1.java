package PracUb;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();

        ex1.number(10);
    }

    void number (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
