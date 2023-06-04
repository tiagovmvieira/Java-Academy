import java.util.Scanner;

public class MethodsAndFields
{

    // These are class variables that are available to every method
    // Variables declared in a method are only accessible in that method (local variable)
    static double myPI = 3.14159265;
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        /* Basic Method
         * accessModifier static returnDataType methodName (parameters)
         * { Statements }
         * Access Modifier: Determines who can execute a method
         * static: Used when you want to be able to execute a method that isn't part of a class definition
         * Return Data Type: The data type of value returned after a method executes (void if no values are returned)
         * Method Name: Must start with a letter, but can include letters, numbers, $, or _
         * Parameters / Arguments: Values passed to a method
         */

        System.out.println(addThem(1, 2)); // addThem(1, 2) will be replaced with the value that method returnsß

        System.out.println("\n");

        // Demonstrating passing by value
        int d = 5;

        // Changes to the variable d in tryToChange don't effect its value globally

        // We are passing the value of d to tryToChange and not the variable
        tryToChange(d);
        System.out.println("Static Variable d = "+ d);

        // Guessing a random number
        System.out.println("\n");

        System.out.println(getRandomNum()); // Both prints and generates the value for randomNumber

        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1)
        {
            System.out.print("Guess a number between 0 and 50: ");

            // Accpet ann integer input from the user
            // You can't declare this variable inside the while loop if you ant to access it outside the while looop

            randomGuess = userInput.nextInt();

            guessResult = checkGuess(randomGuess);

        }

        System.out.println("Yes the random number is " + randomGuess + "!");
        System.out.println(randomNumber); // Random value was changed globally by getRandomNum

    }

    public static int addThem(int a, int b)
    {
        // Adds the two numbers sent and returns the solution
        // public is the access modifier and means anyone can execute this method
        // Java Methods can return any primitive data type, or reference to an object (More on that later)
        double smallPI = 3.140; // This variable is local to the addThem function

        // compare returns 0 if equal | -1 if smallPI is less than myPI | 1 if smallPI is greater than myPI
        System.out.println(Double.compare(smallPI, myPI));

        int c;
        c = a + b;

        // return returns a value that replaces the call to this method
        // It must be an int since we defined this method returns ints above

        return c;
    }

    public static void tryToChange(int d)
    {
        d = d + 1;
        System.out.println("tryToChange d = " + d);
    }

    public static int getRandomNum()
    {
        // Creates a random number between o and 50
        // Since randomNumber is a class variable tou don't have to declare, or define its type
        // If int randomNumber was declared in this method it wouldn't effect the global variable named randomNumber

        randomNumber = (int) (Math.random() * 51);

        return randomNumber;
    }

    public static int checkGuess(int guess){
        if(guess == randomNumber){
            return -1;
        } else {
            return guess; // Must return a value of type int
        }
    }

}
