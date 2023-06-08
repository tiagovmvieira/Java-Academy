import java.util.Arrays;

public class MonsterTwo
{
    static char[][] battleBoard = new char[10][10]; // 2D array

    // Class Variables or Fields
    // You declare constants with final

    public final String TOMBSTONE = "Here Lies a Dead monster";

    // private fields are not visible outside the class
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private boolean alive = true;

    // public variables are visible outside of the class
    // You should have as few as possible public fields
    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition = 0;
    public static int numOfMonsters = 0;

    public static void buildBattleBoard()
    {
        for(char[] row : battleBoard)
        {
            Arrays.fill(row, '*');
        }

    }

    public static void redrawBoard()
    {
        int k = 1;
        while(k <= 30){
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int i = 0; i < battleBoard.length; i++)
        {
            for(int j = 0; j < battleBoard[i].length; j++)
            {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }

        int j = 1;
        while(j <= 30){
            System.out.print('-');
            j++;
        }
        System.out.println();

    }

    // Class Method
    // Accessor Methods are used to get and set the values of private fields

    public int getAttack()
    {
        return attack;
    }

    public int getMovement()
    {
        return movement;
    }

    public int getHealth()
    {
        return health;
    }

    public boolean getAlive()
    {
        return alive;
    }

    public void setHealth(double decreaseHealth)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;

        if (health < 0)
        {
            alive = false;
        }
    }

    public MonsterTwo(int health, int attack, int movement, String name)
    {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do{
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        } while(battleBoard[randNumX][randNumY] != '*'); // monsters not on top of other monsters

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonsters++;
    }

    public MonsterTwo()
    {
        numOfMonsters++;
    }

}
