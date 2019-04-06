import java.util.ArrayList;

public class Kunde extends Person {

    String passNr;

    double portmonnaie = 500;

    ArrayList<Product> shoppingCart = new ArrayList<Product>();

    public Kunde(String name) {
        super(name);
    }

    void method_do_smt() {
        String message = this.name + this.birthday;
    }

    public boolean hasEnoughMoney(double price) {
        if (this.portmonnaie >= price) {
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("Kunde " + name + "\t" + portmonnaie);
        for (Product p : shoppingCart) {
            System.out.println(p.getNiceName());
        }
    }

    public void giveMoney(double price) {
        portmonnaie -= price;
//        portmonnaie = portmonnaie - price;
    }

    public void receiveProduct(Product product) {
        shoppingCart.add(product);
    }
}
