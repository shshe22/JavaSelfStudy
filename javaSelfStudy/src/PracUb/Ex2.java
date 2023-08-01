package PracUb;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();

        System.out.println(ex2.add(10));
    }

    int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
