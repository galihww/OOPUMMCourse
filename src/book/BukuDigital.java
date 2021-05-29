package book;

public class BukuDigital extends Buku {
    private String url;

    public BukuDigital(String judul, String penulis, int tahunTerbit, String kategori, String url){
        super(judul, penulis, tahunTerbit, kategori);
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    @Override
    public String toString() {
        return super.toString()+ "url='" + url + '\'';
    }
}
