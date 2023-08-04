import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        TODO: provide input validation
//        DESC: principal values between 1,000 and 1,000,000. invalid input prints reminder
//        DESC: annual interest rate value between 1 and 30. invalid input prints reminder
//        DESC: terms value between 1 and 30. invalid input prints reminder

        final int PERCENT = 100;
        final int MONTHS_IN_YEARS = 12;

        Scanner scanner = new Scanner(System.in);

//        NOTES: if input is between 1,000 and 1,000,000 continue to interest rate
//        NOTES: if input is invalid print reminder and try input again
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

//        NOTES: if input is between 1 and 30 continue to payment terms
//        NOTES: if input is invalid print reminder and try input again
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

//        NOTES: if input is between 1 and 30 continue, calculate mortgage
//        NOTES: if input is invalid print reminder and try input again
        System.out.println("Payment Terms (years): ");
        byte years = scanner.nextByte();
        int months = years * MONTHS_IN_YEARS;

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) -1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Monthly Mortgage Payment: " + formattedMortgage);
    }
}