// NOTES: what classes do we need?
// DESC: mortgage calculator
// DESC: displays calculations

public class Main {

    final static int PERCENT = 100;
    final static int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        int principal = (int) Console.readInput("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readInput("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readInput("Payment terms (years): ", 1, 30);

        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printPaymentSchedule();
    }

}