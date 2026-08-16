import java.util.Scanner;

public class GreatestCommonDivisor {
    public void divisor()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=in.nextInt();
        int b=in.nextInt();
        while(b!=0)
        {
           int remainder=a%b;
            a=b;
            b=remainder;
        }
        System.out.println("Greatest divisor :"+a);
        in.close();

    }

}
