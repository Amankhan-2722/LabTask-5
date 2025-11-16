import java.util.Scanner;
public class LabTask710{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // Third character
        System.out.println(s.charAt(2));

        //Second to last character
        System.out.println(s.charAt(s.length() - 2));

        //First five characters
        System.out.println(s.substring(0, 5));

        //All but last two characters
        System.out.println(s.substring(0, s.length() - 2));

        //Characters with even indices
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            even.append(s.charAt(i));
        }
        System.out.println(even.toString());

        //Characters with odd indices
        StringBuilder odd = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            odd.append(s.charAt(i));
        }
        System.out.println(odd.toString());

        //Reverse order
        StringBuilder reverse = new StringBuilder(s).reverse();
        System.out.println(reverse.toString());

        //Every second character in reverse order starting from last
        StringBuilder reverseSkip = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            reverseSkip.append(s.charAt(i));
        }
        System.out.println(reverseSkip.toString());

        // Length of the string
        System.out.println(s.length());
    }
}
