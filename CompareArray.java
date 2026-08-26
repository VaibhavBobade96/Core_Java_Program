import java.util.Scanner;

public class CompareArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of array 1:");
        int size1 = sc.nextInt();

        System.out.println("Please enter size of array 2:");
        int size2 = sc.nextInt();

        int[] arr1 = new  int[size1];
          int[] arr2 = new int[size2];

        if (size1 == size2) {

            System.out.println("Both arrays have equal size.");

            System.out.println("Enter elements of array 1:");

            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter elements of array 2:");

            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }

            boolean isEqual = true;

            for (int i = 0; i < size1; i++) {

                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println("Both arrays are equal.");
            } else {
                System.out.println("Both arrays are not equal.");
            }

        } else {

            System.out.println("Both arrays are not equal because their sizes are different.");
        }
    }
}