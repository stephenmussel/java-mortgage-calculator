import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double balances : calculator.getRemainingBalances()) {
            System.out.println(currency.format(balances));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        String formattedMortgage = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Mortgage Payment: " + formattedMortgage);
    }
}
