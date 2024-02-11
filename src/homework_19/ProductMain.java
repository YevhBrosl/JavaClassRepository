package homework_19;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("pen", 1.50);
        Product product1 = new Product("pencil", 0.75);
        Product product2 = new Product("rubber", 0.50);
        Product product3 = new Product("ruler", 1.05);
        Product product4 = new Product("pencil sharpener", 1.65);

        System.out.println(product.info());
        System.out.println(product1.info());
        System.out.println(product2.info());
        System.out.println(product3.info());
        System.out.println(product4.info());

        System.out.println("Цена pen -5%: " + product.changePrice(-5));
        System.out.println("Цена rubber +10%: " + product2.changePrice(10));

        System.out.println("Всего количество продуктов: " + Product.numberOfProducts());


    }
}
