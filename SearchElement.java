import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of Array:");
        int size = sc.nextInt();

        double a[] = new double[size];

        System.out.println("Please Enter the Elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }

        System.out.println("Enter any specific element:");
        double num = sc.nextDouble();

        boolean isFound = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == num) {
                isFound = true;
                break;
            }
        }

        if (isFound == true) {
            System.out.println("The element is found");
        } else {
            System.out.println("The element is not found");
        }

    }
}h