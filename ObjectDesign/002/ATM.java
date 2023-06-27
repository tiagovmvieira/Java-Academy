import java.util.Scanner;

public class ATM
{

    private Transaction theTransaction = null;
    private BankNetwork networkOfBanksOnATM = null;

    static Scanner userInput = new Scanner(System.in);

    public ATM(BankNetwork bankNetwork){

        this.networkOfBanksOnATM = bankNetwork;

    }


    public boolean isStripReadable(Card theCard){

        int numberOfDigitsInStrip = (int) (Math.log10(theCard.getStripNumber()));

        theTransaction = new Transaction(theCard.getStripNumber());

        if (numberOfDigitsInStrip == 8){

            return true;
        } else {

            return false;
        }

    }


    public boolean isATMCardsBankInNetwork(Card theCard){

        if (networkOfBanksOnATM.isATMCardsBankInNetwork(theCard)){

            theTransaction.setStripNumber(theCard.getStripNumber());
            theTransaction.setDidCardVerify(true);

            return true;
        } else {
            return false;
        }

    }


    public boolean insertPIN(Card customerCard, int pin){

        int numberOfDigits = (int) (Math.log10(pin));

        if (numberOfDigits != 4){
            System.out.println("You have to enter 4 digits for PIN");

            return false;
        } else {

            theTransaction.setPIN(pin);

            networkOfBanksOnATM.verifyThePIN(theTransaction);

        }

        return false;
    }


    public void pickAcctToAccess(){

        System.out.println("What Account do you Want to Withdrawal From ");
        System.out.println("( 1 - Savings, 2 - Checking )");

        if (userInput.hasNextInt()){

            int numberEntered = userInput.nextInt();

            theTransaction.setAccToWithdrawalFrom(numberEntered);
        } else {

            System.out.println("You entered an invalid Option");

        }

    }


    public void amountToWithdrawal(){

        System.out.println("How much do you want to Withdrawal");
        System.out.println("( Increments of $10 ) ");

        if (userInput.hasNextInt()){

            int numberEntered = userInput.nextInt();

            theTransaction.setWithdrawalAmt(numberEntered);

            networkOfBanksOnATM.requestWithdrawalAmt(theTransaction);

        } else {

            System.out.println("You entered an invalid Option");

        }

    }


    public void getTransactionInfo(){

        System.out.println("Thank You " + theTransaction.getCustomerName() + " for using XYZ Bank");
        System.out.println("Date / Time of Transaction: " + theTransaction.getCurrentDateTime());
        System.out.println("\nTRANSACTION");
        System.out.println("Removed $ " + theTransaction.getWithdrawalAmt() + " from your ");
        if(theTransaction.getAccToWithdrawalFrom() == 1){

            System.out.println("Savings Account.\nYour Current balance is " + theTransaction.getAcctBalance());
        } else {

            System.out.println("Checking Account.\nYour Current balance is " + theTransaction.getAcctBalance());
        }

    }

}
