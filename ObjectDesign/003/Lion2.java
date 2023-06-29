public class Lion2 extends Ani
{

    private String name;

    Lion2(String newName){

        super(newName);
        name = newName;

    }

    public String toString(){

        return "Lion named " + name;
    }

}
