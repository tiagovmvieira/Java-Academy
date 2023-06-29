public class EnemyRobotAdapter implements EnemyAttacker
{

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){

        theRobot = newRobot;
    }


    @Override
    public void attack() {

        theRobot.jumpOnEnemy();

    }

}
