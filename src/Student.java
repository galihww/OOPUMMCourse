public class Student {
    private int studentId;
    private String name;
    private String ssn;
    private double gpa;
    public final int SCHCODE = 34958;

    public Student(){}

    public Student(int studentId, String name, String ssn, double gpa){
        this.studentId = studentId;
        this.name = name;
        this.ssn = ssn;
        this.gpa = gpa;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString(){
        return "Student Id: "+ getStudentId() +
                " Student Name: "+ getName() +
                " Student SSN: " + getSsn() +
                " Student GPA: " + getGpa() +
                " School Code: " + SCHCODE;
    }
}
