import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ADD: payment schedule feature
//        DESC: display remaining balance after each payment

        int principal = (int) readInput("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) readInput("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readInput("Payment terms (years: ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Mortgage Payment: " + formattedMortgage);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        System.out.println("placeholder...");
    }

    public static double readInput(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years) {

        final int PERCENT = 100;
        final int MONTHS_IN_YEARS = 12;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
        int months = years * MONTHS_IN_YEARS;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) - 1);

        return mortgage;
    }
}