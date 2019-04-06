public class DataStructure {

    public static void main(String[] args) {
        Department consoleDep = new Department("Console Dep");
        consoleDep.setName("Console Dep");
        consoleDep.products[0] = new Product("Switch", 300.59);
        consoleDep.products[1] = new Product("GameBoy", 150.99);

        double doublePrice = consoleDep.products[0].price * 2;

        Department tvDep = new Department("TV Dep");
        tvDep.products[0] = new Product("Samsung", 300.59, 15);
        tvDep.products[1] = new Product("Philips", 150.99, 3);
        tvDep.inventarize();

        Department[] depList = new Department[10];
        depList[0] = consoleDep;
        depList[1] = tvDep;

        Kunde kunde = new Kunde("Peter");
        Product product = tvDep.findProductByName("Samsung");
        if (product != null) {
            System.out.println(product.brand + " " + product.price);
            boolean hasMoney = kunde.hasEnoughMoney(product.price);
            System.out.println("Kunde has enough [" + product.price + "]: " + hasMoney);
            if (hasMoney) {
                tvDep.removeFromShelf(product);
                tvDep.inventarize();
                kunde.giveMoney(product.price);
                kunde.receiveProduct(product.clone());
                kunde.print();
            } else {
                System.err.println("You can not purchase this");
            }
        } else {
            System.err.println("Product not found");
        }
    }

}
