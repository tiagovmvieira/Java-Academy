import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Transaction
{

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    private int bankID;
    private Date currentDateTime;
    private String customerName;
    private double acctBalance;
    private int withdrawalAmt;
    private int accountNumberUsed;
    private int pin;
    private int stripNumber;
    private int acctToWithdrawalFrom;

    private boolean didCardVerify = false;


    public Transaction(int stripNumber){

        bankID = BankNetwork.getFirstTwoDigits(stripNumber);

        currentDateTime = new Date();

        // Holds the account number minus either 1 for savings, or
        // 2 for checking at the end until that is added by
        // setAccountNumberUsed() below

        accountNumberUsed = stripNumber;

    }

    public int getBankID() { return bankID; }
    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName){

        this.customerName = customerName;
    }

    public String getCurrentDateTime() { return dateFormat.format(currentDateTime); }

    public int getPIN() { return pin; }

    public void setPIN(int pin){

        this.pin = pin;

    }

    public void setStripNumber(int stripNumber){

        this.stripNumber = stripNumber;

    }

    public int getStripNumber() { return stripNumber; }

    public void setDidCardVerify(boolean cardVerified){

        didCardVerify = (cardVerified)?true:false;

    }

    public boolean getDidCardVerify(){ return didCardVerify; }


    public void setAccToWithdrawalFrom(int acctToWithdrawalFrom){

        this.acctToWithdrawalFrom = acctToWithdrawalFrom;
        this.accountNumberUsed = (stripNumber * 10) + acctToWithdrawalFrom;

    }

    public int getAccToWithdrawalFrom() { return acctToWithdrawalFrom; }

    public void setWithdrawalAmt(int withdrawalAmt){

        this.withdrawalAmt = withdrawalAmt;

    }

    public int getWithdrawalAmt() { return withdrawalAmt; }

    public int getAccountNumberUsed() { return accountNumberUsed; }

    public void setAcctBalance(double newAcctBalance){

        this.acctBalance = newAcctBalance;

    }

    public double getAcctBalance() { return acctBalance; }

}
