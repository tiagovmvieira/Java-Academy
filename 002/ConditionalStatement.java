public class ConditionalStatement
{
    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random() * 50);

        /* Relational Operators:
         * Java has 6 relational operators
         * > : Greater than
         * < : Less than
         * == : Equal To
         * != : Not Equal To
         * >= : Great Than Or Equal To
         * <= : Less Than Or Equal To
         */

        if (randomNumber < 25)
        {
            System.out.println("The random number is less than 25!");
        }
        else if (randomNumber > 25)
        {
            System.out.println("The random number is greater than 25");
        }
        else if (randomNumber == 25)
        {
            System.out.println("The random number is equal to 25");
        }
        else if (randomNumber != 15)
        {
            System.out.println("The random number is not equal to 15");
        }
        else if (randomNumber <= 25)
        {
            System.out.println("The random number is less than or equal to 25");
        }
        else if (randomNumber >= 25)
        {
            System.out.println("The random number is great than or equal to 25");
        }
        else
        {
            System.out.println("The random number is " + randomNumber);
        }

        System.out.println("The random number is " + randomNumber);

        /* Logical Operators:
         * Java has 6 logical operators
         * ! : Converts the boolean value to its right to its opposite form ie. true or false
         * & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
         * && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
         * | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
         * || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
         * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
         */

        if (!(false))
        {
            System.out.println("\nI turned false into true");
        }

        if ((true) && (true))
        {
            System.out.println("Both are true");
        }

        if ((false) | (true))
        {
            System.out.println("One is true");
        }

        if ((false) ^ (true))
        {
            System.out.println("One is true, and one is False");
        }

        // The Conditional or Ternary Operator assigns one or another value based on a condition
        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println("\nThe biggest value " + biggestValue);

        /* When you have a limited number of possible values a switch statement makes sense
        * The switch statement checks the value of theGrade to the values that follow case
        * If it matches it executes the code between () and then break ends the switch statement
        * default code is executed if there are no matches
        * You are not required to use the break or default statements
        * The expression must be an int, short, byte or char
        */

        char theGrade = 'b';

        switch (theGrade)
        {
            case 'A':
                System.out.println("Great Job");
                break;
            case 'b':
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Ok");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("You failed");
                break;
        }

    }
}
