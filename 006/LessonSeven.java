public class LessonSeven {

    public static void main(String[] args)
    {
        // You create an object using the blueprint of this class as follows
        // className objectName = new ClassName();

        Monster Frank = new Monster();

        // Since the object name is public you can change it directly

        Frank.name = "Frank";

        // You retrieve class field valuess by listing the objectName.fieldName
        // You execute class methods by listing objectName.methodName()

        System.out.println(Frank.name + " has an attack value of " + Frank.getAttack());

    }
}
