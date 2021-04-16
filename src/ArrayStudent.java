public class ArrayStudent {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[5];

        arrStudent[0] = new Student(121, "Budi", "111-201-12", 3.0);
        arrStudent[1] = new Student(122, "Ani", "111-201-13", 3.5);
        arrStudent[2] = new Student(123, "Wati", "111-201-14", 3.72);
        arrStudent[3] = new Student(124, "Joko", "111-201-15", 4.0);
        arrStudent[4] = new Student(125, "Rudi", "111-201-16", 3.1);

        System.out.println("for each");
        for(Student elementStudent: arrStudent){
            System.out.println(elementStudent.toString());
        }
        System.out.println("for");
        for(int i=0; i< arrStudent.length; i++){
            System.out.println(arrStudent[i].toString());
        }

        Student[] arrStudent2 = new Student[2];
        for(int i=0;i< arrStudent2.length; i++){
            arrStudent2[i] = new Student();
        }

        arrStudent2[0].setStudentId(126);
        arrStudent2[0].setName("Andi");
        arrStudent2[0].setSsn("111-201-17");
        arrStudent2[0].setGpa(3.9);

        arrStudent2[1].setStudentId(127);
        arrStudent2[1].setName("Ardi");
        arrStudent2[1].setSsn("111-201-18");
        arrStudent2[1].setGpa(3.3);

        for(Student elementStudent: arrStudent2)
            System.out.println(elementStudent.toString());
    }
}
