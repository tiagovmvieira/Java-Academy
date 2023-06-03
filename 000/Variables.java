public class Variables
{
    static String randomString = "String to print";
    static final double PINUM = 3.141529; // unmutable

    public static void main(String[] args)
    {
        System.out.println(randomString);
        System.out.println(PINUM);

        // declaration statement
        int integerOne, integerTwo;

        // expression statement
        integerOne = 22;
        integerTwo
                =
                integerOne
                        + 1;

        System.out.println(integerTwo);
    }
}
