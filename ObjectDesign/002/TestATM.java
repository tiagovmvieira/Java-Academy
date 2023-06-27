public class TestATM {

    public static void main(String[] args){

        Account theAccount = new Account(10, "Tiago Vieira", "C", 10000.00, 1234);

        Card customersATMCard = new Card(theAccount.getPIN(), theAccount.getStripNumber());

        Customer theCustomer = new Customer(customersATMCard);

        BankComputer xyzBankComputer = new BankComputer("XYZ Bank");

        xyzBankComputer.addAcctToBank(theAccount);

        BankNetwork theBankNetwork = new BankNetwork();

        theBankNetwork.addBankToNetwork(xyzBankComputer);

        ATM mainStreetATM = new ATM(theBankNetwork);

        mainStreetATM.isStripReadable(customersATMCard);

        mainStreetATM.isATMCardsBankInNetwork(customersATMCard);

        mainStreetATM.insertPIN(customersATMCard, 1234);

        mainStreetATM.pickAcctToAccess();

        mainStreetATM.amountToWithdrawal();

        mainStreetATM.getTransactionInfo();

    }
}
