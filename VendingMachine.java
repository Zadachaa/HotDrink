import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

//    void intProduct(List<Product> products);
//    public VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//
//    private List<Product> productList;
//    private Integer money;
//
//    public Product getproduct(String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;
//    }
//
//    private List<Product> initProduct() {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Мороженка","100"));
//        products.add(new Product( "Чипсеки", "200"));
//        products.add(new Product( "Лимонадик", "150"));
//        return products;
//    }
}
