package book;

public class DriverBuku {
    public static void main(String[] args) {
        Buku hukum = new Buku("Perlindungan Hak Kekayaan Intelektual di Era Global Edisi 2; Sebuah Kajian Kontemporer",
                "Tomi Suryo Utomo",2021,"hukum");
        System.out.println(hukum.toString());

        Buku[] katalogBuku = new Buku[3];
        katalogBuku[0] = new Buku("Ekosistem Estuaria; Antara Produksi Perikanan dan Pencemaran",
                "Supriharyono", 2021,"Perikanan");
        katalogBuku[1] = new Buku("Statika Struktur ",
                "Ramses Yohanes Hutahaean",2021,"Teknik Mesin");
        katalogBuku[2] = new Buku("Analisis Spasial untuk Kehutanan",
                "Ferad Puturuhu", 2021, "Kehutanan");
          //for loop
        for(int i=0;i< katalogBuku.length;i++){
            System.out.println(i+1+". "+katalogBuku[i].toString());
        }
        //for each
        for(Buku kontenBuku: katalogBuku)
            System.out.println(kontenBuku);
    }
}
