public class XYZSilver extends GetSilverPrice {

    private String silverPrice = "30.67 Silver Ask price";
    private String name = "XYZ Silver";

    @Override
    public double getPriceOfSilver() {

        String[] stringPrice = silverPrice.split(" ");

        return Double.parseDouble(stringPrice[0]);
    }

    public String getName(){ return name; }

}
