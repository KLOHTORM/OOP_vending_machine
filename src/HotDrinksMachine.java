import java.util.ArrayList;

public class HotDrinksMachine implements VendingMachine{
    ArrayList<Product> array = new ArrayList<Product>();

    @Override
    public void initProducts(ArrayList arr) {
        array = arr;
    }

    @Override
    public Product GetProduct(String name) {
        for (int i = 0; i < array.size() + 1; i++) {
            if (array.get(i).name.equals(name)) {
                return array.get(i);
            }
        }
        return null;
    }
}
