import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        int[] kuotaKelas = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                kuotaKelas[i] = (i + 1) * 10;
                System.out.println("Kelas " + (i + 1) + ": " + kuotaKelas[i] + " kuota");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            Mahasiswa mhsError = new Mahasiswa("Adit", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        Mahasiswa mhs = new Mahasiswa("Mike", 24);

        mhs.ambilMataKuliah("Dasar Pemrograman", 4);
        mhs.ambilMataKuliah("Basis Data", 3);
        try {
            mhs.ambilMataKuliah("AI", 4);
        } catch (SksTidakCukupException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        SistemAkademik sistem = new SistemAkademik();
        try {
            sistem.gabungKelas("KLS001", 0);
        } catch (KelasPenuhException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            sistem.cetakDokumenKrs("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Sesi KRS ditutup.");
        System.out.println("Koneksi database diputuskan.");
    }
}
