public class StudentInfo {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            System.out.println("이름   학번   국어   영어   수학   총점   평균");
            System.out.println("======================================");

            Student student1 = new Student("학생1", 111, 100, 100, 100);
            student1.inf();

            Student student2 = new Student("학생2", 222, 20, 20, 20);
            student2.inf();

            Student student3 = new Student("학생3", 333, 30, 30, 30);
            student3.inf();

            Student student4 = new Student("학생4", 444, 40, 40, 40);
            student4.inf();

            Student student5 = new Student("학생5", 555, 50, 50, 50);
            student5.inf();

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

class Student {
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
        return sum = (getKor() + getEng() + getMath());
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public float getAvg() {
        return avg = getSum()/SUBJECT_NUM;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public Student(String name, int stuNum, int kor, int eng, int math) {
        setName(name);
        setStuNum(stuNum);
        setKor(kor);
        setEng(eng);
        setMath(math);
    }
    void inf() {
        System.out.println(getName() + "  " + getStuNum() + "   " + getKor() + "   " + getEng() + "   " + getMath() + "   "  + getSum() + "   " + getAvg());
    }

}
