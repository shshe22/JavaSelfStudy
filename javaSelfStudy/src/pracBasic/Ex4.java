package pracBasic;

public class Ex4 {
    public static void main(String[] args) {
        int[] scores = {78, 98, 75, 96, 85, 93};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum/(float)scores.length);

    }
}
