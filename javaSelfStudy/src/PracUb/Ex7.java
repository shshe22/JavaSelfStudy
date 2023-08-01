package PracUb;

public class Ex7 {
    public static void main(String[] args) {

        Ex7 ex7 = new Ex7();

        String name = "김유범";
        String id = "971204-1234567";
        String tel = "010-1234-5678";

        System.out.println("=== 증명서 ===");
        System.out.println("이름 : " + ex7.getHiddenData(name, 1)); // 개인 정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + ex7.getHiddenData(id, 8));
        System.out.println("전화번호 : " + ex7.getHiddenData(tel, 9));

    }

    public String getHiddenData (String str, int n) {
        String sum = "";

        for (int i = 1; i <= str.length() -n; i++) {
            sum += "*";
        }
        return str.substring(0,n) + sum;
    }

}
