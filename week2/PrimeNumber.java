import java.util.Scanner;

public class PrimeNumber {
    public void Prime()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2 && n>=2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }

}
