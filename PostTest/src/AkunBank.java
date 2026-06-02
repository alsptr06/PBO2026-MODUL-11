public class AkunBank {
    private String noRek;
    private double saldo;
    private double totalTransferHarian;

    public AkunBank(String noRek, double saldo, double totalTransferHarian) {
        this.noRek = noRek;
        this.saldo = saldo;
        this.totalTransferHarian = 0;
    }

        public void tarikTunai (double nominal){
            if (saldo < nominal) {
                throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk melakukan penarikan sebesar " + nominal);
            } else{
                System.out.println("berhasil tarik tunai sebesar" + nominal);
                saldo =-nominal;
            }
        }

        public void transfer (String noRekTujuan, double nominal) throws SaldoTidakMencukupiException, IllegalArgumentException, BatasTransferHarianException {
            if (nominal > totalTransferHarian) {
                throw new BatasTransferHarianException("Batas transfer harian terlampaui");
            } else if (saldo < nominal) {
                throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk melakukan transfer sebesar " + nominal);
            } else{
                System.out.println("berhasil mentransfer sebesar" + nominal);
                saldo =-nominal;
                totalTransferHarian += nominal;
            }
        }
}
