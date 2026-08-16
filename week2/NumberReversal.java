import java.util.Scanner;

public class NumberReversal {
    public void reverse()
    {
         Scanner in = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = in.nextInt();

        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);

        in.close();
    }
}
    
