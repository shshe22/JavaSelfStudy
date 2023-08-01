public class StudentInfo2 {

        public static void main(String[] args) {

            System.out.println("이름   학번  국어  영어  수학  총점  평균");
            System.out.println("======================================");

            Student2 student1 = new Student2();
            student1.setName("학생1");
            student1.setStuNum(111);
            student1.setKor(100);
            student1.setEng(100);
            student1.setMath(100);
            student1.inf();

            Student2 student2 = new Student2();
            student2.setName("학생2");
            student2.setStuNum(222);
            student2.setKor(20);
            student2.setEng(20);
            student2.setMath(20);
            student2.inf();

            Student2 student3 = new Student2();
            student3.setName("학생3");
            student3.setStuNum(333);
            student3.setKor(30);
            student3.setEng(30);
            student3.setMath(30);
            student3.inf();

            Student2 student4 = new Student2();
            student4.setName("학생4");
            student4.setStuNum(444);
            student4.setKor(40);
            student4.setEng(40);
            student4.setMath(40);
            student4.inf();

            Student2 student5 = new Student2();
            student5.setName("학생5");
            student5.setStuNum(555);
            student5.setKor(50);
            student5.setEng(50);
            student5.setMath(50);
            student5.inf();

//            int kkk = student5.math;
//            int aaa = student5.getMath();

            System.out.println("======================================");

            int korTot;
            int engTot;
            int mathTot;

            korTot = student1.getKor() + student2.getKor() + student3.getKor() + student4.getKor() + student5.getKor();
            engTot = student1.getEng() + student2.getEng() + student3.getEng() + student4.getEng() + student5.getEng();
            mathTot = student1.getMath() + student2.getMath() + student3.getMath() + student4.getMath() + student5.getMath();

            System.out.printf("총점        " + korTot + "  " + engTot + "  " + mathTot);

        }

}

    class Student2 {
        private String name;
        private int stuNum;     // student.kor = 80;   student.setKor(80);
        private int kor, eng, math;
        private int sum;
        private float avg;
        final int SUBJECT_NUM = 3;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStuNum() {
            return stuNum;
        }

        public void setStuNum(int stuNum) {
            this.stuNum = stuNum;
        }

        public int getKor() {
            return kor;
        }

        public void setKor(int kor) {
            this.kor = kor;
        }

        public int getEng() {
            return eng;
        }

        public void setEng(int eng) {
            this.eng = eng;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getSum() {
            return sum = (kor + eng + math);
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public float getAvg() {
            return avg = sum/SUBJECT_NUM;
        }

        public void setAvg(float avg) {
            this.avg = avg;
        }

        void inf() {
            System.out.println(getName() + "  " + getStuNum() + "  " + getKor() + "  " + getEng() + "  " + getMath() + "  "  + getSum() + "  " + getAvg());
        }

    }
