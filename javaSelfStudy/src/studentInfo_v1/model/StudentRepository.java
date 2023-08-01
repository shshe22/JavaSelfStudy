package studentInfo_v1.model;

/*
    students -arraylist<student>
    createStudent - student
    getStudent - student
    getStudents - arraylist<student>
    updateStudent - student
    deleteStudent -student
 */

import studentInfo_v1.entity.Student;
import studentInfo_v1.view.StudentView;

import java.util.ArrayList;
import java.util.List;

;

/*
    데이터를 보관 및 관리
    배열을 이용
 */
public class StudentRepository {

    List<Student> studentList = new ArrayList<>();
    StudentView studentView;

    public Student createStudent (int studentId, String name, String department, String address, int credit) {
        Student info = new Student(studentId, name, department, address, credit);
        studentList.add(info);
        return info;
    }

    public void getStudent () {

    }

    public List<Student> getStudents() {

        return studentList;
    }

    public void updateStudent () {

    }

    public void deleteStudent () {

    }

}
