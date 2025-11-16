import java.util.Scanner;
public class LabTask72{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code (0–127): ");
        int code = input.nextInt();

        char character = (char) code;

        System.out.println("The character for ASCII code " + code + " is " + character);
    }
}
