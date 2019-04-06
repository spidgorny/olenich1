public class Department {

    private String name = "";

    // m2
    public double area;

    public Product[] products = new Product[10];

    public Department(String name) {
        this.setName(name);
    }

    public double areaTimes(int multiplier) {
        return this.area * multiplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name.toUpperCase();
    }

    public String getArea() {
        return this.area + "m2";
    }

    public void inventarize() {
        System.out.println("Department " + getName());
        for (Product prd : products) {
            if (prd != null) {
                System.out.println(prd.getNiceName());
            }
        }
    }

    public Product findProductByName(String search) {
        for (Product prd : products) {
            if (prd != null) {
                if (prd.brand == search) {
                    return prd;
                }
            }
        }
        return null;
    }

    public void removeFromShelf(Product product) {
        for (Product prd : products) {
            if (prd != null) {
                if (prd.brand == product.brand) {
                    prd.buy();
                    return;
                }
            }
        }
    }
}
