import java.util.Scanner;

public class MenuCalculator {
    public void calculator()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter choice");
    
    int choice= in.nextInt();
    do
    {
        System.out.println("1:add");
        System.out.println("2:subtract");
        System.out.println("3:multiply");
        System.out.println("4:divide");
        System.out.println("0:exit");

        choice= in.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Add");
            break;
            case 2:
             System.out.println("Subtract");
             break;
            case 3:
            System.out.println("Multiply");
            break;
            case 4:
            System.out.println("Divide");
            break;
            case 0:
            System.out.println("Exit");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
    
             while(choice!=0);
    
            in.close();
 }
}






    




