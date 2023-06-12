// Here I intoduce the String class
// A String is an object unlike the other primitive data types

public class Strings
{
    public static void main(String[] args){

        // We create a String like this
        String randomString = "I'm just a random string";

        // If we want to use quotes in a string escape it with \
        // Always surround Strings with quotes " " and not Apostrophes ' '
        String gotToQuote = "He said, \"I'm here\"";

        /* Other common Escape Codes
         * \n : Newline
         * \b : Backspace
         * \' : Apostrophe
         * \" : Quote
         * \\ : Backslash
         */

        // We combine Strings with a +
        System.out.println(randomString + " " + gotToQuote);

        // We can add other data type to the string with a +
        int numTwo = 2;
        System.out.println(randomString + " " + numTwo);

        /* We convert primitive types to a string with toString
         * String byteString = Byte.toString(bigByte);
         * String shortString = Short.toString(bigByte);
         * String intString = Integer.toString(bigInt);
         * String longString = Long.toString(bigByte);
         * String floatString = Float.toString(bigByte);
         * String doubleString = Double.toString(bigByte);
         * String booleanString = Boolean.toString(bigByte);
         *
         * We convert from String to primitives with parse
         * int stringToInt = Integer.parseInt(intString);
         * parseSort, parseLong, parseByte, parseDouble,
         * parseBoolean, parseFloat
         */

        // We compare strings with equals or equalsIgnoreCase
        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        if(uppercaseStr.equals(lowercaseStr))
        {
            System.out.println("They're equal");
        }

        if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
        {
            System.out.println("Same letters");
        }

    }
}
