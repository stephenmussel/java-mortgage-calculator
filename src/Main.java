// NOTES: what classes do we need?
// DESC: mortgage calculator
// DESC: displays calculations

public class Main {

    public static void main(String[] args) {

        int principal = (int) Console.readInput("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readInput("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readInput("Payment terms (years): ", 1, 30);

//        TODO: create calculator object
        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        TODO: create report object
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}