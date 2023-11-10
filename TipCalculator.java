import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the tip calculator app.");
        System.out.print("What was the total bill? $");
        Scanner sc = new Scanner(System.in);
        float bill = sc.nextFloat();
        System.out.print("How many people to split the bill? ");
        float people = sc.nextFloat();
        System.out.print("What percentage tip would you like to give? 10, 12, or 15? ");
        float tip = sc.nextFloat();
        sc.close();
        float total = Math.round(((bill + bill*tip/100)/people)*10)/10;
        System.out.printf("Each person should pay: $%.1f\n", total);
    }
}