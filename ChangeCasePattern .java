import java.util.Scanner;

public class ChangeCasePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                System.out.print(" ");
            }
            else if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(ch));
            }
            else {
                System.out.print(Character.toLowerCase(ch));
            }
        }
    }
}