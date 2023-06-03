public class PrimitiveDataTypes
{
    public static void main(String [] args)
    {
        byte bigByte = 127; // Minimum value -128 Maximum value 127
        short bigShort = 32767; // Minimum value -32768 Maximum value 32767
        int bigInt = 2147483647; // Minimum value -2147483648 Maximum value 2147483647
        long bigLong = 9223372036854775807L; // Minimum value -9223372036854775808L
        float bigFloat = 3.14F; // You must end a float with an F
        double bigDouble = 3.1234567890D; // The D is not required with doubles

        System.out.println(Float.MAX_VALUE); // Check the max Value - Float is precise to 6 decimal places
        System.out.println(Double.MAX_VALUE); // Check the max Value - Double is precise to 15 decimal places

        boolean trueOrFalse = true; // Booleans are True or False, not 1 or 0

        // A char will accept a number or a character surrounded by apostrophes
        char randomChar = 65; // Character Code for A is 65 Minimum value 0 Maximum Value 65535
        char anotherChar = 'A';

        System.out.println('\n');
        System.out.println(randomChar);
        System.out.println(anotherChar);

        // chars can also contain escaped characters
        char backSpace = '\b';
        char formFeed = '\f';
        char lineFeed = '\n';
        char carriageReturn = '\r';
        char horizontalTab = '\t';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backSlash = '\\';

        // A string contains a series of characters
        String randomString = "I'm just a random";
        String anotherString = "string";

        // You combine string with a +
        String combinedString = randomString + ' ' + anotherString;
        System.out.println('\n');
        System.out.println(combinedString);

        // How to convert any other type to a string
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);
        String charString = Character.toString(randomChar); // There's no need

        System.out.println('\n');
        System.out.println(byteString);
        System.out.println(booleanString);
        System.out.println(charString);

        System.out.println('\n');
        // Can't do this because char is a primitive data type
        // System.out.println(randomChar.getClass());

        // You can do this because String is an object
        System.out.println(charString.getClass());

        // You use casting to convert from one primitive type to another
        // If you convert from a number that is to big the largest possible value will be used instead
        double aDoubleValue = 3.1456789;
        System.out.println('\n');
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);

        /* To cast to other primitive types just proceed with the conversion to type
        * ie (byte) (short) (long) (double)
        * (float) (boolean) & (char) don't work
        * (char) stays as a number instead of a character
        */

        // Use parseInt to convert a string into an integer
        int stringToInt = Integer.parseInt(intString);
        System.out.println('\n');
        System.out.println(stringToInt);

        /* Other parse functions
        * parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
        * There is no reason to parse a Character
        */
    }
}
