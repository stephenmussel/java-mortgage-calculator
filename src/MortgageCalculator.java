public class MortgageCalculator {

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(int numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        int numberOfPayments = years * Main.MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        int months = years * Main.MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) - 1);

        return mortgage;
    }
}
