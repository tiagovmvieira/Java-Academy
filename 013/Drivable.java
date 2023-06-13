/* Java doesn't allow us to inherit from ore than one
 * class. So, what we do when we want to add additional
 * functionality? We create an interface. Interfaces are empty
 * classes. They provide all of the methods we must use, but none of the code.
 */

// This is how we define an interface. They normally
// have a name that is an adjective. Adjectives modify
// nouns. Most objects have noun names
public interface Drivable
{
    // We can put class variables in an interface, but we should understand
    // that their values are final and can't be changed
    double PI = 3.14159265;

    // All methods in an interface must be implemented
    // They are public and abstract by default
    // An abstract method must be defined by any class
    // that uses the interface
    int getWheels();

    // You can't define a method as final and abstract
    // final means the method can't be changed and
    // abstract means it must be changed
    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);

}
