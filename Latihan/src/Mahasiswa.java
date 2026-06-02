public class Mahasiswa {
    private String nama;
    private int sisaSks;

    public Mahasiswa(String nama, int sks) {
        this.nama = nama;
        setSksMaksimal(sks);
    }

    public void setSksMaksimal(int sks) {
        if (sks < 2 || sks > 24) {
            throw new IllegalArgumentException("Kesalahan sistem. Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        }
        this.sisaSks = sks;
    }

    public int getSisaSks() {
        return sisaSks;
    }

    public String getNama() {
        return nama;
    }

    public void ambilMataKuliah(String namaMatkul, int bebanSks) {
        if (sisaSks < bebanSks) {
            throw new SksTidakCukupException("Maaf, sisa SKS Anda (" + sisaSks + ") tidak cukup untuk mengambil " + namaMatkul + " (" + bebanSks + " SKS).");
        }
        sisaSks -= bebanSks;
        System.out.println("Berhasil mengambil " + namaMatkul + " (" + bebanSks + " SKS). Sisa SKS: " + sisaSks);
    }
    }



