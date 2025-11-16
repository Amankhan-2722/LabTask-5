import java.util.Scanner;
public class LabTask77{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int first = s.indexOf('f');
        int last = s.lastIndexOf('f');

        if (first == -1) {
        } else if (first == last) {
            System.out.println(first);
        } else {
            System.out.println(first + " " + last);
        }
    }
}
