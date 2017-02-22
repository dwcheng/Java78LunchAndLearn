import java.util.ArrayList;
import java.util.List;

class Product {
    private double price;
    private boolean isEssential;
    private String name;

    Product(double price, boolean isEssential, String name) {
        this.price = price;
        this.isEssential = isEssential;
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    boolean isEssential() {
        return isEssential;
    }

    void setEssential(boolean essential) {
        isEssential = essential;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class StreamsSimpleExample {
    private static List<Product> getProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(2.4, false, "Apples"));
        result.add(new Product(5.6, true, "Banannas"));
        result.add(new Product(1, false, "Books"));
        result.add(new Product(7, false, "Ice Cream"));

        return result;
    }

    // List the names of all essential goods over 5 price units
    public static void main(String[] args) {
        List<Product> products = getProducts();

        for (Product p : products) {
            if (p.isEssential() && p.getPrice() > 5) {
                System.out.println(p.getName());
            }
        }
    }
}
