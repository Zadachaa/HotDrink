import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("cola", 1, 2));
        products.add(new BottleOfWater("cola", 2, 3));
        products.add(new BottleOfWater("fanta", 2, 4));
        products.add(new HotDrink("tea", 100, 1, 90));
        products.add(new HotDrink("tea", 100, 1, 5));
        HotDrinkVendingMachine vm = new HotDrinkVendingMachine(products);

        System.out.println(vm.getProduct("cola"));
        System.out.println(vm.getProduct("cola", 3));
        System.out.println(vm.getProduct("tea"));
        System.out.println(vm.getProduct("tea", 1, 5));

        List<Product> products2 = new ArrayList<>();
        products2.add(new BottleOfWater("cola", 2, 3));
        products2.add(new BottleOfWater("cola", 1, 2));
        products2.add(new BottleOfWater("fanta", 2, 4));
        products2.add(new HotDrink("tea", 100, 1, 5));
        products2.add(new HotDrink("tea", 100, 1, 90));
        HotDrinkVendingMachine vm2 = new HotDrinkVendingMachine(products2);

        System.out.println(vm2.getProduct("cola"));
        System.out.println(vm2.getProduct("cola", 2));
        System.out.println(vm2.getProduct("tea"));
        System.out.println(vm2.getProduct("tea", 1, 90));
    }
}
