package pracBasic;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 8, 9, 10};

        int[] count = new int[2];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        count[0] = even;
        count[1] = odd;
        System.out.println(Arrays.toString(count));
    }
}
