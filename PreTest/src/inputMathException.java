public class inputMathException extends Exception {
    double pembilang;
    double penyebut;

    public inputMathException(double pembilang, double penyebut) {
        super("Input tidak valid: pembilang = " + pembilang + ", penyebut = " + penyebut);
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    @Override
    public String getMessage() {
        return "Error: Input tidak valid untuk pembilang " + pembilang + " dan penyebut " + penyebut;
    }
}