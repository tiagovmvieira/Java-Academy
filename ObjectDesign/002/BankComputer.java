import java.util.ArrayList;
public class BankComputer {

    private int bankID = 9;
    private String bankName = "";

    private ArrayList<Account> accounts = new ArrayList<>();
    public static int numberOfBanks = 0;
    public BankComputer(String newBankName){

        bankName = newBankName;
        numberOfBanks++;

        this.bankID += numberOfBanks;

    }

    public void addAcctToBank(Account theAccount){

        this.accounts.add(theAccount);

    }


    public int getBankID() { return bankID; }

    public Boolean verifyTheStripNumber(Card theCard) {

        Boolean cardVerification = false;

        for (Account account : accounts) {

            if (theCard.getStripNumber() == account.getStripNumber()){

                cardVerification = true;
            }

        }

        return cardVerification;

    }


    public Boolean verifyThePIN(Transaction theTransaction){

        boolean cardVerification = false;

        if(theTransaction.getDidCardVerify()){

            for(Account account: accounts){

                if ((account.getPIN() == theTransaction.getPIN()) && (account.getStripNumber() == theTransaction.getStripNumber())){

                    cardVerification = true;

                    theTransaction.setCustomerName(account.getCustomerName());

                }

            }

        }

        return cardVerification;

    }


    public void requestWithdrawalAmt(Transaction theTransaction){

        for(Account account: accounts){

            if (account.getAcctNumber() == theTransaction.getAccountNumberUsed()){

                if (account.getAcctBalance() >= theTransaction.getWithdrawalAmt()){

                    double newAccountBalance = account.getAcctBalance() - theTransaction.getWithdrawalAmt();

                    account.setAcctBalance(newAccountBalance);

                    theTransaction.setAcctBalance(newAccountBalance);
                } else {

                    System.out.println("You can't have that much money");

                }

            }

        }

    }

}
