package Day_49.task1.version3;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new SuperSpecialCustomer("Artur", "USA, Crops Avenue");
        customer1.addItemToCart(new Item("Bread", 10));
        customer1.addItemToCart(new Item("Butter", 50));

        System.out.println(customer1 + " cart total: " + customer1.getCartTotal());
    }
}
