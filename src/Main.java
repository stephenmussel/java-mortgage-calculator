import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        TODO: refactor
//        DESC: create method of calculating mortgage
//        DESC: create method for capturing inputs

        final int PERCENT = 100;
        final int MONTHS_IN_YEARS = 12;
        int principal = 0;
        float monthlyInterest = 0;
        int months = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Principal must be between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Annual Interest Rate must be between 1 and 30");
        }

        while (true) {
            System.out.println("Payment Terms (years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                months = years * MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Payment terms (years) must be between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Monthly Mortgage Payment: " + formattedMortgage);
    }
}