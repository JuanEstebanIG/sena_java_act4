public class Product {

    private String type;
    private String name;
    private String brand;
    private double price;
    private boolean inStock;
    private int stock;

    public Product(){
         this.type = "Electronica";
         this.name = "Laptop";
         this.brand = "Dell";
         this.price = 1000.0;
         this.inStock = true;
         this.stock = 10;
    }
    
    public Product(String type, String name, String brand, double price, boolean inStock, int stock) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inStock = inStock;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public boolean isInStock() {
        return inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "Product [type=" + type + 
            ", name=" + name + 
            ", brand=" + brand + 
            ", price=" + price + 
            ", inStock=" + inStock + 
            ", stock=" + stock + "]";
    }

}
