package Day_30_Constractor.vehicles;

public class MainVehicleClass {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", null, "Red");
        ferrari.installEngine(500, 2022);
        ferrari.printProperties();

        Engine engine = new Engine();
        engine.horsePower = 1500;
        engine.model = 2020;

        Truck truck = new Truck("Truck", null,"black", engine);
        truck.printProperties();



    }
}

