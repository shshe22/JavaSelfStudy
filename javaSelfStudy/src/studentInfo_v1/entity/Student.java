package studentInfo_v1.entity;

/*
    studentId - int
    name - string
    department - string
    address - string
    credit - float
 */

public class Student {

    private int studentId;
    private String name;
    private String department;
    private String address;
    private float credit;

    public Student(int studentId, String name, String department, String address, float credit) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.address = address;
        this.credit = credit;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }
}
