import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Masukkan pembilang: ");
            double pembilang = scanner.nextDouble();

            System.out.print("Masukkan penyebut: ");
            double penyebut = scanner.nextDouble();

            if (penyebut == 0) {
                throw new ArithmeticException(pembilang, penyebut);
            }

            if (pembilang < 0 || penyebut < 0) {
                throw new inputMathException(pembilang, penyebut);
            }

            SistemKalkulator kalk = new SistemKalkulator(pembilang, penyebut);
            System.out.println("Hasil: " + kalk.pembagian());

        } catch (InputMismatchException e) {
            System.out.println("Input bukan angka!");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (inputMathException e) {
            System.out.println(e.getMessage());

        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner berhasil ditutup.");
            }
        }
    }
}