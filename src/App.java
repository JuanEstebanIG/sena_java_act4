public class App {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product();
        Product product2 = new Product("Electronica", "Smartphone", "Samsung", 800.0, true, 20);
        
        product1.setPrice(750.0);
        product1.setName("Laptop");
        product1.setStock(5);
        
        System.out.println("precio: " + product1.getPrice() + " stock: " + product1.getStock());

        
        product2.setPrice(950.0);
        System.out.println("Marca: " + product2.getBrand() + " El tipo de producto es: " + product2.getType());

        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
