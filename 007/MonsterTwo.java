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

    // public variables are visible outside the class
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

    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
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

    public void moveMonster(MonsterTwo[] monsters, int arrayItemIndex) {
        // isSpaceOpen will be used to track whether the space the
        // monster plans to move into is occupied
        boolean isSpaceOpen = true;

        // Define the maximum x and y for the battle board
        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        // while loop used to make sure we don't move a monster into an occupied space
        while (isSpaceOpen) {
            // Randomly generate move direction N, S, E, or W
            int randMoveDirection = (int) (Math.random() * 4);

            // Randomly generate move distance based on max move distance (class variable)
            int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));

            // Prints move distance and move direction
            System.out.println(
                    "Monster: " + this.name + ", " +
                    "Move Distance: " + randMoveDistance + ", " +
                    "Move Direction: " + randMoveDirection);


            // Erase monsters character on the board by replacing it with a *
            battleBoard[this.yPosition][this.xPosition] = '*';

            if (randMoveDirection == 0) // N
            {
                // Find new xPosition & yPosition based on the current position on the board
                // If statements won't allow monster to move off the board

                if ((this.yPosition - randMoveDistance) < 0) {
                    this.yPosition = 0;
                } else {
                    this.yPosition = this.yPosition - randMoveDistance;
                }
            } else if (randMoveDirection == 1) // E
            {
                if ((this.xPosition + randMoveDistance) > maxXBoardSpace) {
                    this.xPosition = maxXBoardSpace;
                } else {
                    this.xPosition = this.xPosition + randMoveDistance;
                }
            } else if (randMoveDirection == 2) // S
            {
                if ((this.yPosition + randMoveDistance) > maxYBoardSpace) {
                    this.yPosition = maxYBoardSpace;
                } else {
                    this.yPosition = this.yPosition + randMoveDistance;
                }
            } else // W
            {
                if ((this.xPosition - randMoveDistance) < 0) {
                    this.xPosition = 0;
                } else {
                    this.xPosition = this.xPosition - randMoveDistance;
                }
            }

            // monster.length returns the number of items in the array monster
            for (int i = 0; i < monsters.length; i++) {
                // If statement skips checking the same monster position against itself
                if (i == arrayItemIndex) {
                    continue;
                }

                if (onMySpace(monsters, i, arrayItemIndex)) {
                    // If a monster tries to move to an occupied space the
                    // while loop repeats after break out of the for loop
                    isSpaceOpen = true;
                    break;
                } else {
                    // There was no monster in the space so end the while loop
                    isSpaceOpen = false;

                }

            }

        } // End of while loop

        // Set the value in the array to the first letter of the monster
        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

    }

    public boolean onMySpace(MonsterTwo[] monsters, int indexToChk1, int indexToChk2)
    {
        // Checks if the 2 monsters have the same x && y position
        if ((monsters[indexToChk1].xPosition) == (monsters[indexToChk2].xPosition) &&
                (monsters[indexToChk1].yPosition) == (monsters[indexToChk2].yPosition))
        {
            return true;
        } else {
            return false;
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

    public static void main(String[] args)
    {

    }

}
