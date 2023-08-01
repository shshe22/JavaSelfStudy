package studentInfo_v1.view;

/*
    printAllStudent - void
    printStudent - void
 */

import studentInfo_v1.entity.Student;

import java.util.List;

public class StudentView {


    public void printStart() {
        System.out.println("=========================================");
        System.out.println("           대학생 관리 프로그램 🏢          ");
        System.out.println("=========================================");
        System.out.println();
    }

    public void printMenu() {
        System.out.println("== 메뉴 🐶 ==");
        System.out.println("1 : 학생 데이터 입력 / 2 : 학생 데이터 검색" +
                " / 3 : 전체 학생 데이터 리스트 / 4 : 학생 데이터 변경 / " +
                "5 : 학생 데이터 삭제 / 0 : 프로그램 종료");
        System.out.println("=========================================");
        System.out.println(" 메뉴를 선택하십시오. *정수만 입력❗❗");
        System.out.println("=========================================");
    }

    public void printEnterData () { System.out.println("== 1. 학생 데이터 입력 == "); }
    public void printSearchData () { System.out.println("== 2. 학생 데이터 검색 == "); }
    public void printAllStudent () { System.out.println("== 3. 전체 학생 데이터 리스트 == "); }
    public void printChangeInfo () { System.out.println("== 4. 학생 데이터 변경 == "); }
    public void printDeleteInfo () { System.out.println("== 5. 학생 데이터 삭제 == "); }
    public void printExitPro() { System.out.println(" 프로그램이 종료되었습니다."); }
    public void printErr() { System.out.println(" 메뉴 선택 오류가 발생했습니다. 다시 선택하세요."); }

    public void printStudentNum() { System.out.print(" 학번 : "); }
    public void printName() { System.out.print( "이름 : "); }
    public void printDepartment() { System.out.print(" 학과 : "); }
    public void printAddress() { System.out.print(" 주소 : "); }

    public void printCredit() { System.out.print(" 학점 : "); }

    public void printStudent(Student info) {
        System.out.printf(" 학번 : %d / 이름 : %s / 학과 : %s / 주소 : %s / 학점 : %.1f%n", info.getStudentId(), info.getName(), info.getDepartment(), info.getAddress(), info.getCredit());
    }

    public void printStudentAll(List<Student> studentList) {
        for(Student student : studentList) {
            printStudent(student);
        }
    }

    public void printImportNum() { System.out.println(" 검색할 대상의 학번을 입력하세요. "); }

    public void printSelectStudent() { System.out.println(" 변경/삭제할 대상의 학번을 입력해주세요. "); }

}


