import java.util.Scanner;

public class leapyear {
    public void year()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter year");
        int year=in.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0))
        
            System.out.println("Leap year");
            else
                System.out.println("Not a leap year");
           
        in.close();
}
}
