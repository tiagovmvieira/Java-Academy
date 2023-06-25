public class Player
{
    private String name = "";
    private String coinOption = "";
    public String[] coinValue = {"Heads", "Tails"};

    public Player(String theName){

        name = theName;
    }

    public String getCoinOption(){

        return coinOption;
    }

    public void setCoinOption(String opponentFlip){

        coinOption = (opponentFlip == "Heads")?"Tails":"Heads";
    }

    public String getRandomCoinOption(){

        int randNum = (Math.random() < 0.5)?0:1;
        coinOption = coinValue[randNum];

        return coinOption;
    }

    public void didPlayerWin(String winningFlip){

        if (coinOption == winningFlip){
            System.out.println(name + " won with a flip of " + coinOption);
        } else {
            System.out.println(name + " lost with a flip of " + coinOption);
        }
    }


}
