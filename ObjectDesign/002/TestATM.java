public class TestATM {

    public static void main(String[] args){

        Account theAccount = new Account(10, "Tiago Vieira", "C", 10000.00, 1234);

        Card customersATMCard = new Card(Account.getPIN(), theAccount.getStripNumber());

        Customer theCustomer = new Customer(customersATMCard);



    }
}
