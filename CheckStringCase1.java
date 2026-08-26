import java.util.Scanner;

class CheckStringCase1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;

        for (int i = 0; i < str.length(); i++)  // JAVA
        {
            char ch = str.charAt(i); // 1) j 2) A 3

            if (ch >= 'A' && ch <= 'Z')
            {
                hasUpper = true;
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                hasLower = true;
            }
        }

        if (hasUpper && !hasLower)
        {
            System.out.println("The string is in UPPERCASE.");
        }
        else if (!hasUpper && hasLower)
        {
            System.out.println("The string is in lowercase.");
        }
        else if (hasUpper && hasLower)
        {
            System.out.println("The string contains both uppercase and lowercase letters.");
        }
        else
        {
            System.out.println("The string contains no alphabets.");
        }

        sc.close();
    }
}