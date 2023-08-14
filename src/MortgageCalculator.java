public class MortgageCalculator {

    public final static int PERCENT = 100;
    public final static int MONTHS_IN_YEAR = 12;
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(int numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        int months = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) - 1);

        return mortgage;
    }

    public int getYears() {
        return years;
    }
}
