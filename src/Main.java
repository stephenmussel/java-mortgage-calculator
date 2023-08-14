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

        MortgageReport.printMortgage(principal, annualInterest, years);
        MortgageReport.printPaymentSchedule(principal, annualInterest, years);
    }

    public static double calculateBalance(int principal, float annualInterest, byte years, int numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int months = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) - 1);

        return mortgage;
    }
}