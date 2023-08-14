import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= calculator.getYears() * Main.MONTHS_IN_YEAR; month++) {
            double newBalance = calculator.calculateBalance(month);
            String formattedNewBalance = NumberFormat.getCurrencyInstance().format(newBalance);
            System.out.println(formattedNewBalance);
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Mortgage Payment: " + formattedMortgage);
    }
}
