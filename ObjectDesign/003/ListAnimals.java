public class ListAnimals
{

    private Monkey theMonkey;
    private Lion theLion;

    public ListAnimals(Monkey monkey, Lion lion){
        theMonkey = monkey;
        theLion = lion;

    }

    public void displayAnimals(){

        System.out.println(theMonkey);
        System.out.println(theLion);

    }

    public static void main(String[] args){

        Monkey monkey = new Monkey("Max");
        Lion lion = new Lion("Tom");

        ListAnimals listAnimals = new ListAnimals(monkey, lion);

        listAnimals.displayAnimals();

    }

}
