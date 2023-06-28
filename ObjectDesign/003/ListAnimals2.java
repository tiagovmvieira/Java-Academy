import java.util.ArrayList;

public class ListAnimals2
{
    private ArrayList<Ani> theAnimals = new ArrayList<Ani>();

    public void addAnimalToList(Ani newAnimal){

        theAnimals.add(newAnimal);

    }

    public void displayAnimals(){

        for (Ani animal: theAnimals){

            System.out.println(animal);

        }

    }

    public static void main(String[] args){

        Ani monkey = new Monkey2("Max");
        Ani lion = new Lion2("Tom");
        Ani lion2 = new Lion2("Carl");

        ListAnimals2 listAnimals = new ListAnimals2();

        listAnimals.addAnimalToList(monkey);
        listAnimals.addAnimalToList(lion);
        listAnimals.addAnimalToList(lion2);

        listAnimals.displayAnimals();

    }



}
