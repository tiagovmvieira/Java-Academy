public class TestAdapter
{

    public static void main(String[] args){

        EnemyAttacker theTank = new EnemyTank();
        EnemyRobot theRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(theRobot);

        theTank.attack();
        robotAdapter.attack();

    }

}
