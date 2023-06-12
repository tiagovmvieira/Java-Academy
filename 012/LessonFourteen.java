public class LessonFourteen
{

    public static void main(String[] args){

        // Animal object named genericAnimal
        Animal genericAnimal = new Animal();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        System.out.println();
        // Cat class like any other
        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        // name, favFood and favToy
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.getToy());

        // Class creation based on the super class
        Animal tabby = new Cat("Tabby", "Salmon", "Ball");

        // Objects can be passed like any other field
        System.out.println();
        acceptAnimal(tabby);
    }

    public static void acceptAnimal(Animal randAnimal){

        // Get the name and favFood for the Animal passed
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        // Polymorphism
        // The interpreter automatically figures out what type
        // of Animal it's dealing with and checks to make sure
        // if methods were overwritten that they are called
        // instead
        randAnimal.walkAround();

        System.out.println();
        // The intrepreter won't find anything that doesn't
        // originally exist in the Animal class however
        // System.out.println(randAnimal.favToy); Throws an ERROR

        // If we want access to fields or methods only found
        // in the Cat class we have to cast the object to
        // that specific class first
        Cat tempcat = (Cat) randAnimal;

        System.out.println(tempcat.favToy);

        // We could also cast the object directly like this
        System.out.println(((Cat) randAnimal).favToy);

        // We can use instaceOf to check what type of object
        // we have. This results in a positive for Animal
        // and for Cat
        if(randAnimal instanceof Cat)
        {
            System.out.println(randAnimal.getName() + " is a cat.");
        }

    }

}
