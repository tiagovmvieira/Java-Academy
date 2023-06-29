public class ABCSilver extends GetSilverPrice
{
    private String silverPrice = "SLV 30.66";

    private String name = "ABC Silver";

    public double getPriceOfSilver(){

        String stringPrice = silverPrice.substring(4);

        return Double.parseDouble(stringPrice);

    }

    public String getName() { return name; }

}
