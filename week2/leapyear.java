import java.util.Scanner;

public class leapyear {
    public void PritGrades()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks");

        int marks = in.nextInt();
        if(marks>=80 && marks<=100){
            System.out.println("Distinction");
        }
        else if(marks >=70 && marks <=79)
        {
            System.out.println("Merit");
        }
        else if(marks>=50 && marks<=69)
        {
            System.out.println("Pass");
        }
        else if(marks >=0 && marks<=49){
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid input");
        }
        in.close();

    }    
}
