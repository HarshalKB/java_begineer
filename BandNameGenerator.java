import java.util.Scanner;

public class BandNameGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to the band name generator app.");
        System.out.println("What is the name of the city you grew up in?");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        System.out.println("What was the name of your first pet?");
        String pet = sc.next();
        sc.close();
        System.out.printf("The name of your band could be %s %s.%n", city, pet);
    }
}