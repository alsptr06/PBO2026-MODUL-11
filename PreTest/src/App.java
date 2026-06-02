public class App {
    public static void main(String[] args) {

        try {
            SistemKalkulator kalk1 = new SistemKalkulator(10, 2);
            System.out.println("Hasil: " + kalk1.pembagian());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double pembilang = 10;
            double penyebut = 0;

            if (penyebut == 0) {
                throw new ArithmeticException(pembilang, penyebut);
            }

            SistemKalkulator kalk2 = new SistemKalkulator(pembilang, penyebut);
            System.out.println("Hasil: " + kalk2.pembagian());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            double pembilang = -5;
            double penyebut = 2;

            if (pembilang < 0 || penyebut < 0) {
                throw new inputMathException(pembilang, penyebut);
            }

            SistemKalkulator kalk3 = new SistemKalkulator(pembilang, penyebut);
            System.out.println("Hasil: " + kalk3.pembagian());

        } catch (inputMathException e) {
            System.out.println(e.getMessage());
        }
    }
}