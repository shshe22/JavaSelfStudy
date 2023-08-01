package studentInfo_v1;


/*
    mbc 를 이용하여 프로그램을 실행
 */

import studentInfo_v1.controller.StudentController;

public class StudentApplication {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        StudentController studentController = new StudentController();
        studentController.initController();
        studentController.structure();
    }
}
