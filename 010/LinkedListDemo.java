// The LinkedList class is a collection based on a Linked List
// instead of an array. They are perfect when we
// expect to perform many additions and deletions with a collection.
// When using a linked list we don't have to move items around when we
// add or delete an item. They aren't particularly suited to providing access based off
// of index searches like an array though. Each object in a linked list
// contains a pointer to the objects that proceed and follow it.
// When we change an ArrayList a new array is created by it.

import java.util.Arrays;
import java.util.LinkedList; // LinkedList library methods

public class LinkedListDemo {

    public static void main(String[] args)
    {

        // Creates a LinkedList object
        LinkedList linkedListOne = new LinkedList();

        // Creates a LinkedList that contains Strings
        LinkedList<String> names = new LinkedList<String>();

        // We use add to add items to the LinkedList
        names.add("Ahmed Bennani");
        names.add("Ali Syed");

        // addLast places the object last in the list
        names.addLast("Nathan Martin");

        // addFirst places the object first in the list
        names.addFirst("Joshua Smith");

        // We can define what position to place the object in
        names.add(0, "Noah Peeters");

        // We replace a value in an index with set()
        names.set(2, "Paul Newman");

        // We remove items either by providing the index, or
        // the value
        names.remove(4);
        names.remove("Joshua Smith");

        // You can use the enhanced for to print them out
        for(String name : names)
        {
            System.out.println(name);
        }

        /* OUTPUT
         * Noah Peeters
         * Paul Newman
         * Ali Syed
         */

        // We can retrieve values with get()
        System.out.println("\nFirst Index: " + names.get(0));

        /* OUTPUT
         * First Index: Noah Peeters
         */

        // Retrieve the first value with getFirst()
        System.out.println("\nFirst Index: " + names.getFirst());

        /* OUTPUT
         * First Index: Noah Peeters
         */

        // Retrieve the last value with getLast()
        System.out.println("\nLast Index: " + names.getLast());

        /* OUTPUT
         * Last Index: Ali Syed
         */

        LinkedList<String> nameCopy = new LinkedList(names);

        // When we print out the LinkedList itself the toString
        // method is called
        System.out.println("\nnameCopy: " + nameCopy);

        /* OUTPUT
         * nameCopy: [Noah Peeters, Paul Newman, Ali Syed]
         */

        // We can check if an object is in the list with contains()
        if(names.contains("Noah Peeters"))
        {
            System.out.println("\nNoah is Here!");
        }

        /* OUTPUT
         * Noah is Here!
         */

        // We can check if everything in one list is in another
        if(names.containsAll(nameCopy))
        {
            System.out.println("\nCollections are the same!");
        }

        /* OUTPUT
         * Collection are the same!
         */

        // Return the index for an object with indexOf
        System.out.println("\nIndex of Ali is: " + names.indexOf("Ali Syed"));

        /* OUTPUT
         * Index of Ali is: 2
         */

        // Check if a list is empty with isEmpty()
        System.out.println("\nList Empty: " + names.isEmpty());

        /* OUTPUT
         * List Empty: false
         */

        // Get the number of items in the list with size
        System.out.println("\nHow many values: " + names.size());

        /* OUTPUT
         * How many values: 3
         */

        // peek() retrieves the first element, but doesn't throw an error
        // if there is no element to retrieve. Returns the first element if any
        System.out.println("\nLook without error: " + names.peek());

        /* OUTPUT
         * Look without error: Noah Peeters
         */

        // poll() returns the first value and deletes it from the list
        System.out.println("\nRemove first element: " + nameCopy.poll());

        /* OUTPUT
         * Remove first element: Noah Peeters
         */

        // pollLast() returns the last value and deletes it from the list
        System.out.println("\nRemove last element: " + nameCopy.pollLast());

        /* OUTPUT
         * Remove last element: Ali Syed
         */

        // push puts a new element on the front of the list
        nameCopy.push("Noah Peeters");

        // pop removes an element on the front of the list
        nameCopy.pop();

        System.out.println("\nnameCopy: " + nameCopy);

        /* OUTPUT
         * nameCopy: [Paul Newman]
         */

        // Create a new array to hold values from the Linked List
        Object[] nameArray = new Object[4];

        // toArray converts the LinkedList into an array of objects
        nameArray = names.toArray();

        // toString converts items in the array into a String
        System.out.println(Arrays.toString(nameArray));

        /* OUTPUT
         * [Noah Peeters, Paul Newman, Ali Syed]
         */

        // clear() deletes everything in the Linked List
        names.clear();

    }
}
