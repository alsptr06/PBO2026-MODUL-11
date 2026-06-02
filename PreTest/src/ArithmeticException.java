public class ArithmeticException extends Exception {
    double pembilang;
    double penyebut;

    public ArithmeticException(double pembilang, double penyebut) {
        super("Error: Pembagian dengan nol tidak diperbolehkan.");
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    @Override
    public String getMessage() {
        return "Error: Pembagian dengan nol tidak diperbolehkan. (" + pembilang + " / " + penyebut + ")";
    }
}