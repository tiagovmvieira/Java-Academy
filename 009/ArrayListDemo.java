import java.util.ArrayList; // The ArrayList library
import java.util.Iterator; // The Iterator Library
import java.util.Arrays; // The Arrays Library

// Collection classes were created to make it easy to keep track
// of groups of objects. An ArrayList differs from an array in
// that it automatically resizes itself automatically. ArrayLists
// are easy to add to and delete from.

public class ArrayListDemo
{

    public static void main(String[] args)
    {
        // We can create an ArrayList variable
        ArrayList arrayListOne;

        // Then create an ArrayList object
        // We don't have to declare the ArrayList size like
        // we do with arrays (Default Size of 10)
        arrayListOne  = new ArrayList();

        // We can create the ArrayList on one line
        ArrayList arrayListTwo = new ArrayList();

        // We can also define the type of elements the ArrayList
        // will hold
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();

        // This is how we add elements to an ArrayList
        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        ages.add(10);
        ages.add(15);
        ages.add(20);

        // We can also add an element in a specific position
        names.add(2, "Jack Ryan");

        // We retrieve values in an ArrayList with get
        // arrayListName.size() returns the size of the ArrayList
        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println();

        // There's also the enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // We can replace a value using the set method
        names.set(0, "John Adams");

        // We can remove an item with remove
        names.remove(3);

        // We can also remove the first and second items with
        // the removeRange method
        // names.removeRange(0, 1);
        System.out.println();

        // When we print out the ArrayList itseld the toString
        // method is called
        System.out.println(names);

        // Before the enhanced for we had to use an iterator
        // to print out values in an ArrayList
        System.out.println();

        // Creates an iterator object with methods that allow
        // us to iterate through the values in the ArrayList
        Iterator indivItems = names.iterator();

        // When hasNext is called it returns true or false
        // depending on whether there are more items in the list

        while(indivItems.hasNext())
        {
            // Next retrieves the next item in the ArrayList
            System.out.println(indivItems.next());
        }

        System.out.println();
        // I create an ArrayList without stating the type of values
        // it contains (Default is Object)
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        // addAll adds everything in one ArrayList to another
        nameCopy.addAll(names);
        System.out.println(nameCopy);

        String paulYoung = "Paul Young";

        // You can add variable values to an ArrayList
        names.add(paulYoung);

        System.out.println();
        // contains returns a boolean values based off of whether
        // the ArrayList contains the specified object
        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here!");
        }

        System.out.println();
        // containsAll checks if everything in one ArrayList is in
        // another ArrayList
        if(names.containsAll(nameCopy))
        {
            System.out.println("Everything in nameCopy is in names");
        } else
        {
            System.out.println("Not everything in nameCopy is in names");
        }

        // Clear deletes everything in the ArrayList
        names.clear();

        System.out.println();
        // isEmpty returns a boolean values based on if the ArrayList
        // is empty
        if (names.isEmpty()){
            System.out.println("The ArrayList is empty!");
        }

        System.out.println();

        int moreNamesLength = nameCopy.size();
        Object[] moreNames = new Object[moreNamesLength];

        // toArray converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();

        // toString converts items in the array into a String
        System.out.println(Arrays.toString(moreNames));

    }

}
