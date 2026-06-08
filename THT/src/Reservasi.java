import java.util.ArrayList;
import java.util.List;

class Reservasi {
    private List<Kereta> daftarKereta;

    public Reservasi() {
        daftarKereta = new ArrayList<>();
        daftarKereta.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket)
            throws RuteTidakDitemukanException, TiketHabisException {

        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus 16 karakter");
        }

        for (int i = 0; i < nik.length(); i++) {
            if (!Character.isDigit(nik.charAt(i))) {
                throw new DataPenumpangTidakValidException("NIK hanya boleh angka");
            }
        }

        Kereta keretaDitemukan = null;
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kodeKereta)) {
                keretaDitemukan = k;
                break;
            }
        }

        if (keretaDitemukan == null) {
            throw new RuteTidakDitemukanException("Kode kereta tidak ditemukan");
        }

        if (jumlahTiket > keretaDitemukan.getSisaKursi()) {
            throw new TiketHabisException("Tiket tidak cukup",
                    keretaDitemukan.getNamaKereta(), keretaDitemukan.getSisaKursi());
        }

        keretaDitemukan.kurangiKursi(jumlahTiket);
        System.out.println("=== PEMESANAN BERHASIL ===");
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("NIK: " + nik);
        System.out.println("Kereta: " + keretaDitemukan.getNamaKereta());
        System.out.println("Rute: " + keretaDitemukan.getRutePerjalanan());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("==========================");
    }
}
