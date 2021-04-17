package book;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String kategori;

    public Buku(){}

    public Buku(String judul, String penulis, int tahunTerbit, String kategori){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /*
    Method untuk mencetak atribut Buku
     */
    public String toString(){
        return "Judul Buku: "+ getJudul() +
                " Penulis: "+ getPenulis() +
                " Tahun Terbit: "+getTahunTerbit() +
                " Kategori: "+ getKategori();
    }
}
