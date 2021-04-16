public class StudentDriver {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStudentId(123);
        s1.setName("Mary Jane");
        s1.setSsn("111-201-12");
        s1.setGpa(3.5);
        System.out.println(s1.toString());

        Student s2 = new Student(124, "Louis Lane", "111-201-12", 4.0);
        System.out.println(s2.toString());
    }
}
