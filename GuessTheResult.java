import java.util.Scanner;
public class GuessTheResult
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to the Program!!");
        System.out.println("Just think of any number and I will tell you the Result....");
        Scanner input=new Scanner(System.in);
        System.out.println("Step 1: Just think of any number");
        System.out.println("Done with Step1 or not. Enter Yes or No.");
        String a=input.nextLine();
        if(a.equalsIgnoreCase("yes"))
        {
            System.out.println("Step 2: Add the same number to the initial one.");
            System.out.println("Done with Step2 or not. Enter Yes or No.");
            String b=input.nextLine();
            if(b.equalsIgnoreCase("yes"))
            {
                   System.out.println("Enter the number that you want to add= ");
                   int num=input.nextInt();
                   System.out.println("Step 3: Now, add "+num+" to your result");
                   System.out.println("Done with Step3 or not. Enter Yes or No.");
                   String c=input.next();
                   if(c.equalsIgnoreCase("yes"))
                   {
                       System.out.println("Step 4: Now, make one-half of your result\nStep 5: Remove the number that you added in Step 2.");
                       input.nextLine();
                       int result=num/2;
                       System.out.println("Done with all Steps. Enter Yes or No.");
                       String d=input.next();
                       if(d.equalsIgnoreCase("yes"))
                       {
                           System.out.println("You are left with "+result+" na.");
                           System.out.println("I Guessed it Right. Hurrahh!!!!");
                       }
                   }
                    
            }
        }
    }
}
        
