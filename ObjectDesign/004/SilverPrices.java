import java.util.ArrayList;

public class SilverPrices
{

    public static void main(String[] args){

        ArrayList<GetSilverPrice> silverSellers = new ArrayList<GetSilverPrice>();

        silverSellers.add(new ABCSilver());
        silverSellers.add(new XYZSilver());

        for(GetSilverPrice silverPrice: silverSellers){

            System.out.println(silverPrice.getName() + ": " + silverPrice.getPriceOfSilver());
        }
    }
}
