package pracBasic;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        String[] arr1 = {"1", "3", "5", "7", "9"};
        String[] arr2 = {"가", "나", "다"};

        String[] answer = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            answer[i] = arr1[i];
        }

        System.out.println(Arrays.toString(answer));

        for (int i = arr1.length; i < answer.length; i++) {
            answer[i] = arr2[i - arr1.length];
        }

        System.out.println(Arrays.toString(answer));


    }
}
