package book;

public class DriverBuku {
    public static void main(String[] args) {
        Buku hukum = new Buku("Perlindungan Hak Kekayaan Intelektual di Era Global Edisi 2; Sebuah Kajian Kontemporer",
                "Tomi Suryo Utomo", 2021, "hukum");
//      System.out.println(hukum.toString());
//


//        Buku[] katalogBuku = new Buku[3];
//        katalogBuku[0] = new Buku("Ekosistem Estuaria; Antara Produksi Perikanan dan Pencemaran",
//                "Supriharyono", 2021,"Perikanan");
//        katalogBuku[1] = new Buku("Statika Struktur ",
//                "Ramses Yohanes Hutahaean",2021,"Teknik Mesin");
//        katalogBuku[2] = new Buku("Analisis Spasial untuk Kehutanan",
//                "Ferad Puturuhu", 2021, "Kehutanan");
//          //for loop
//        for(int i=0;i< katalogBuku.length;i++){
//            System.out.println(i+1+". "+katalogBuku[i].toString());
//        }
//        //for each
//        for(Buku kontenBuku: katalogBuku)
//            System.out.println(kontenBuku);

//        String [] arrSin = {"Buku ini mengguncang jagat hukum", "sangat menginspirasi", "membawa perubahan"};
//        Sinopsis sin = new Sinopsis("Budi", arrSin);
////      System.out.println(hukum.toString() + "\n" + sin.toArrString());
//
////      Sinopsis sinObj = new Sinopsis("Andi","Buku ini sangat bermanfaat bagi mahasiswa",hukum);
////      System.out.println(sinObj.toObjString());
////      System.out.println(sinObj.getObjSinopsis());
        Buku perikanan = new Buku("Ekosistem Estuaria; Antara Produksi Perikanan dan Pencemaran",
                "Supriharyono", 2021,"Perikanan");
        Buku mesin = new Buku("Statika Struktur ",
                "Ramses Yohanes Hutahaean",2021,"Teknik Mesin");
        Buku kehutanan = new Buku("Analisis Spasial untuk Kehutanan",
                "Ferad Puturuhu", 2021, "Kehutanan");
        Sinopsis sin3 = new Sinopsis("Ari","Buku-buku ini rekomendasi bagi Maba", hukum,mesin, perikanan, kehutanan);
        sin3.toArrObjString();
    }
}
