import java.util.Comparator;
import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}


class PriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}
class RatingComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.rating, p1.rating);
    }
}


public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000, 4.5));
        products.add(new Product("Mobile", 20000, 4.8));
        products.add(new Product("Tablet", 30000, 4.2));

        // User selects: Sort by Price
        Collections.sort(products, new PriceComparator());

        System.out.println("Sorted by Price:");
        for (Product p : products) {
            System.out.println(p);
        }

        // User selects: Sort by Rating
        Collections.sort(products, new RatingComparator());
        
        System.out.println("\nSorted by Rating:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
