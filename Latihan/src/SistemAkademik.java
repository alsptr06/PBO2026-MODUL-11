import java.io.FileNotFoundException;

public class SistemAkademik {
    public void gabungKelas(String kodeKelas, int kuotaTersedia) throws KelasPenuhException {
        if (kuotaTersedia <= 0) {
            throw new KelasPenuhException("Kelas " + kodeKelas + " sudah penuh. Kuota tersedia: 0");
        }
        System.out.println("Berhasil bergabung ke kelas " + kodeKelas + ". Kuota: " + kuotaTersedia);
    }

    public void cetakDokumenKrs(String namaFile) throws FileNotFoundException {
        if (!namaFile.endsWith(".krs")) {
            throw new FileNotFoundException("Format file tidak valid. File harus berekstensi .krs");
        }
        System.out.println("Dokumen KRS berhasil dicetak: " + namaFile);
    }

}

