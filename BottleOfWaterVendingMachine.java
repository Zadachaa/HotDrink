import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public BottleOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                increaseMoney(product.getPrice());
                return product;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return productList;
    }
//
//    @Override
//    public void intProduct(List<Product> products) {
//        productList = products;
//    }

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    void increaseMoney(int amount) {
        money += amount;
    }
}
