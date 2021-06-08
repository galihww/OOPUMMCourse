public class TestString {
    public static void main (String [] args){
        String s = new String("abc");
        System.out.println(s.length());
        System.out.println(s);
        s.replace("a","aa");
        System.out.println(s.length());
        System.out.println(s);
    }
}
