package Day_28_PrimitiveVSReference.task3;

public class Task3 {
    //create class Task3, and create a Customer and assign values
    // to all it's attributes and print/debug;
    public static void main(String[] args) {

        Customer customer = createCustomer("Techno Study");

        System.out.println(customer.name);
        System.out.println(customer.electricityAccount.totalWph);
        System.out.println(customer.electricityAccount.rate);
        System.out.println(customer.electricityAccount.bill);

        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        customer.consumeElectricity(50);
        System.out.println(customer.electricityAccount.totalWph);

        customer.electricityAccount.calculateBill();
        System.out.println(customer.electricityAccount.bill);
    }

    private static Customer createCustomer(String name) {
        Customer customer = new Customer();
        customer.name = name;
        customer.electricityAccount = new ElectricityAccount();
        return customer;
    }
}
