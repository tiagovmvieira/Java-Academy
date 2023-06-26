public class Card {

    private int pin;
    private int stripNumber;

    // Used to create a temp card to check for
    // a valid strip number in a bank database

    // constructor
    public Card(int stripNumber){

        this.stripNumber = stripNumber;
    }

    // Used to create a temp card to check for
    // a valid card strip number and PIN in a
    // bank database

    public Card(int pin, int stripNumber){

        this.pin = pin;
        this.stripNumber = stripNumber;
    }

    public int getPin(){ return pin; }
    public int getStripNumber(){ return stripNumber; }

    public void setPin(int pin){

        this.pin = pin;
    }

    public void setStripNumber(int stripNumber){

        this.stripNumber = stripNumber;
    }

}
