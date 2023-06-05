import java.util.Scanner; // Library that allows to capture user input
import java.util.*; // Allows  to check for InputMismatchException
import java.io.*; // Allows for system input and output through data streams, serialization, and the file system

public class ExceptionHandling
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        divideByZero(2);
        System.out.println("\n");
        System.out.print("How old are you?");
        int age = checkValidAge();

        if (age != 0){
            System.out.println("You are " + age + " years old!");
        }

    }
    public static void divideByZero(int value)
    {
        try
        {
            System.out.println(value / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You can't do that!");
            System.out.println(e.getMessage());
            System.out.println(e.toString());

            // e.printStackTrace();
        }
    }
    public static int checkValidAge(){
        try
        {
            return userInput.nextInt(); // nextInt() receives the user input
        }
        catch (InputMismatchException e)
        {
            userInput.next(); // Skips the last user input and waits for the next
            System.out.print("That isn't a whole number");
            return 0;
        }
    }
}
