package book;

public class Sinopsis {
    private String nama;
    private String isiSinopsis;
    private String [] arrSinopsis;
    Buku objBuku = new Buku();
    Buku [] objArrBuku = new Buku[10];

    public Sinopsis(){
        this.nama = "No Name";
        this.isiSinopsis = "Belum ada sinopsis";
    }

    public Sinopsis(String nama, String isiSinopsis){
        this.nama = nama;
        this.isiSinopsis = isiSinopsis;
    }

    public Sinopsis(String nama, String [] arrSinopsis){
        this.nama = nama;
        this.arrSinopsis = arrSinopsis;
    }

    public Sinopsis(String nama, String isiSinopsis, Buku objBuku){
        this.nama = nama;
        this.isiSinopsis = isiSinopsis;
        this.objBuku = objBuku;
    }

    public Sinopsis(String nama, String isiSinopsis, Buku...objArrBuku){
        this.nama = nama;
        this.isiSinopsis = isiSinopsis;
        this.objArrBuku = objArrBuku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsiSinopsis() {
        return isiSinopsis;
    }

    public void setIsiSinopsis(String isiSinopsis) {
        this.isiSinopsis = isiSinopsis;
    }

    public String [] getArrSinopsis(){
        return arrSinopsis;
    }

    public Buku getObjSinopsis(){
        return objBuku;
    }

    @Override
    public String toString() {
        return "Sinopsis :" +
                "nama='" + nama + '\'' +
                "; isi Sinopsis='" + isiSinopsis + '\'' +
                ';';
    }

    public String toArrString(){
        String conArrSinopsis = "";
        for (String s: arrSinopsis) {
            conArrSinopsis += s + " ";
        }
        return "Sinopsis{" +
                "nama='" + nama + '\'' +
                ", isi Sinopsis='" + conArrSinopsis + '\'' +
                '}';
    }

    public String toObjString(){
        return objBuku.toString()+" "+toString();
    }

    public void toArrObjString(){
        for (Buku book: objArrBuku) {
            System.out.println(book.toString());
        }
        System.out.println(toString());
    }
//    public String toString(String [] arrSinopsis){
//        String conArrSinopsis = "";
//        for (String s: arrSinopsis) {
//            conArrSinopsis += s + " ";
//        }
//        return "Sinopsis{" +
//                "nama='" + nama + '\'' +
//                ", isi Sinopsis='" + conArrSinopsis + '\'' +
//                '}';
//    }
}
