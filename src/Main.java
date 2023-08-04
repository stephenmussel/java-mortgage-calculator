import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        DONE: take input for principal
//        DONE: take input for annual interest rate (%)
//        DONE: take input for payment terms in years
//        TODO: calculate mortgage
//        DESC: mortgage = principal(monthlyInterest(1 + monthlyInterest)^terms/((1 + monthlyInterest)^terms) - 1))

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;

        System.out.println("Payment Terms (years): ");
        byte years = scanner.nextByte();
        int months = years * 12;
        System.out.println(months);

        double mortgage = principal
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, months)))
                / (Math.pow(1 + monthlyInterest, months) -1);

        System.out.println("Monthly Mortgage Payment: " + mortgage);
    }
}