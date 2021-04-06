public class StudentDriver {
    public static void main(String[] args) {
        Student ani = new Student();
        ani.setAge(12);
        ani.setName("ani");
        ani.setIpk(3.5);

        System.out.println(ani.getAge()+" "+ani.getIpk()+" "+ani.getName());
    }
}
