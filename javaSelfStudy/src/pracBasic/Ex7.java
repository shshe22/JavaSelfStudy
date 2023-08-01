package pracBasic;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
//        String str = "hello world";
//        int length = str.length();
//
//        System.out.println(length);

        String[] arr = {"We", "are", "the", "world!"};

        int[] arrNum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = arr[i].length();
        }
        System.out.println(Arrays.toString(arrNum));
    }
}
