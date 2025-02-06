import java.util.List;

public class HotDrinkVendingMachine extends BottleOfWaterVendingMachine {

    public HotDrinkVendingMachine(List<Product> productList) {
        super(productList);
    }

    HotDrink getProduct(String name, int volume, int temperature) {
        List<Product> products = getProducts();
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name)
                        && hotDrink.getVolume() == volume
                        && hotDrink.getTemp() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }

}
