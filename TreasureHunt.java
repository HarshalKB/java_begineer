import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        System.out.println("You are at the river bank in a dense forest.\nType 'wait' to wait for boat, and 'swim' to swim across the river.");
        Scanner sc = new Scanner(System.in);
        String reply = sc.next();
        if (reply.equals("wait")) {
            System.out.println("You crossed the river using the boat. Three doors appeared in front of you.");
            System.out.println("Type 'red' to open the red door, 'white' to open the white door and 'green' to open the green door.");
            reply = sc.next();
            if (reply.equals("red")) {
                System.out.println("You Win!!");
            } else {
                System.out.println("You DIED! Game Over!");
            }
        } else {
            System.out.println("You DIED! Game Over!");
        }
        sc.close();
    }
}