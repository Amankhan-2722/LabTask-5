import java.util.Scanner;
public class LabTask79{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        String left = s.substring(0, first + 1);
        String middle = s.substring(first + 1, last).replace('h', 'H');
        String right = s.substring(last);

        String result = left + middle + right;
        System.out.println(result);
    }
}
