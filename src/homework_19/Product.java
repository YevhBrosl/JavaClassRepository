package homework_19;

public class Product {
    private static long counterId;
    private final long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = counterId;
        this.name = name;
        this.price = price;
        counterId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String info() {
        return "id: " + id + " | " + name + ", price: " + price;
    }

    public double changePrice(int percent) {
        return price + price * percent / 100;
    }

    public static long numberOfProducts() {
        return counterId;
    }
}
