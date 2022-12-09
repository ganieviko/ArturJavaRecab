package Day_49.task1.version1;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Artur", "USA, Crops Avenue",
                CustomerType.SuperSpecialCustomer);
        customer1.addItemToCart(new Item("Bread", 10));
        customer1.addItemToCart(new Item("Butter", 50));

        System.out.println(customer1 + " cart total: " + customer1.getCartTotal());
    }
}
