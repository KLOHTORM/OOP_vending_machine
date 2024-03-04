import java.util.ArrayList;
import java.util.List;

public class Product {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Nuts";
        product1.cost = 14.5;

        Product product2 = new Product();
        product2.name = "Water";
        product2.cost = 20.0;

        Product product3 = new Product();
        product3.name = "Bun";
        product3.cost = 32.2;

        Chips chips1 = new Chips();
        chips1.name = "Salty Chips";
        chips1.cost = 61.3;

        Chips chips2 = new Chips();
        chips2.name = "Cheesy Chips";
        chips2.cost = 63.3;

        Chips chips3 = new Chips();
        chips3.name = "Crab Chips";
        chips3.cost = 65.0;

        HotDrinks hotDrinks1 = new HotDrinks();
        hotDrinks1.name = "Coffee";
        hotDrinks1.cost = 46.0;
        hotDrinks1.temperature = 60;

        HotDrinks hotDrinks2 = new HotDrinks();
        hotDrinks2.name = "Green Tea";
        hotDrinks2.cost = 22.2;
        hotDrinks2.temperature = 63;

        HotDrinks hotDrinks3 = new HotDrinks();
        hotDrinks3.name = "Berry Tea";
        hotDrinks3.cost = 32.2;
        hotDrinks3.temperature = 65;

//        VendingMachine vendingMachine = new VendingMachine();
//        ArrayList<Product> arrayList1 = new ArrayList<Product>(List.of(product1, product2, product3));
//
//        vendingMachine.initProducts(arrayList1);
//        System.out.println(vendingMachine.GetProduct("Bun"));

//        ChipsMachine chipsMachine = new ChipsMachine();
//        ArrayList<Product> arrayList2 = new ArrayList<>(List.of(chips1, chips2, chips3));
//
//        chipsMachine.initProducts(arrayList2);
//        System.out.println(chipsMachine.GetProduct("Salty Chips"));

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        ArrayList<Product> arrayList3 = new ArrayList<>(List.of(hotDrinks1, hotDrinks2, hotDrinks3));

        hotDrinksMachine.initProducts(arrayList3);
        System.out.println(hotDrinksMachine.GetProduct("Berry Tea"));
    }

    @Override
    public String toString() {
        return "Product(" + "Name - " + name + ", Cost = " + cost + ", Temperature = " + temperature + ")";
    }

    String name;
    Double cost;
    Integer temperature;
}
