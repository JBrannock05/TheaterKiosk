import java.util.Scanner;

public class WristbandCheck
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();


        if (age >= 21) {
            System.out.println("You get a wristband.");
        }

        scanner.close();
    }
}