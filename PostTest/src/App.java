public class App {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank("1234567890", 20000000, 10000000);
        akun.tarikTunai(20000000);
        try {
            akun.transfer("0987654321", 20000000);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        }
    }
}