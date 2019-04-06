public class Product {

    String brand;

    double price;

    int amount;

    Product(String b, double p, int a) {
        brand = b;
        price = p;
        amount = a;
    }

    Product(String b, double p) {
        brand = b;
        price = p;
        amount = 1;
    }

    public void buy() {
        amount--;
    }

    public String getNiceName() {
        return "  * " + this.brand + "\t" + this.price + "\t" + this.amount;
    }

    public Product clone() {
        Product copy = new Product(this.brand, this.price);
        return copy;
    }

}
