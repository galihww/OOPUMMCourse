package book;

public class DriverBukuDigital {
    public static void main(String [] args){
        BukuDigital catalogEbook = new BukuDigital("Hukum Perlindungan dan Pengelolaan Lingkungan Hidup di Indonesia",
                "H. Supriadi; Dewi Kemala Sari",2021,"Hukum","http://bukuhukumperlindungan");

        System.out.println(catalogEbook.toString());
    }
}
