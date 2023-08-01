package studentInfo_v1.controller;

/*
    initRepository - void
    initView - void
    createStudent - void
    searchAllStudent - void
    searchStudent - void
    updateStudent - void
    deleteStudent - void
 */

import studentInfo_v1.entity.Student;
import studentInfo_v1.model.StudentRepository;
import studentInfo_v1.view.StudentView;

import java.util.List;
import java.util.Scanner;
public class StudentController {
    Scanner sc = new Scanner(System.in);

    StudentRepository studentRepository;
    StudentView studentView;

    public void initController() {
        initRepository();
        initView();
    }

    public void initRepository() {
        studentRepository = new StudentRepository();
    }

    public void initView() {
        studentView = new StudentView();
    }

    public void structure() {
        Scanner sc = new Scanner(System.in);

        studentView.printStart();

        while(true) {
            studentView.printMenu();
            int menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    studentView.printEnterData();
                    createStudent();
                    break;
                case 2 :
                    studentView.printSearchData();
                    searchStudent();
                    break;
                case 3 :
                    studentView.printAllStudent();
                    searchAllStudent();
                    break;
                case 4 :
                    studentView.printChangeInfo();
                    updateStudent();
                    break;
                case 5 :
                    studentView.printDeleteInfo();
                    deleteStudent();
                    break;
                case 0 :
                    studentView.printExitPro();
                    return;
                default :
                    studentView.printErr();
            }
        }

    }

    public void createStudent() {
        Scanner sc = new Scanner(System.in);

        studentView.printStudentNum();
        int studentId = sc.nextInt();

        studentView.printName();
        String name = sc.next();

        studentView.printDepartment();
        String department = sc.next();

        studentView.printAddress();
        String address = sc.next();

        studentView.printCredit();
        int credit = sc.nextInt();


        Student info = studentRepository.createStudent(studentId, name, department, address, credit);

        studentView.printStudent(info);
        // 레포지토리의 크리에이트 스튜던트 함수를 불러서 데이터 입력
    }

    public void searchStudent() {

    }

    public void searchAllStudent() {
        List<Student> studentList = studentRepository.getStudents();

        studentView.printStudentAll(studentList);
    }

    public void updateStudent() {

    }

    public void deleteStudent() {

    }

}

