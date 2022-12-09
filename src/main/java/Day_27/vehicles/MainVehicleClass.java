package Day_27.vehicles;

public class MainVehicleClass {
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.name = "Ferrari";
        ferrari.color = "Red";
        ferrari.installEngine(500, 2022);
        ferrari.printProperties();

        Truck truck = new Truck();
        truck.name = "Truck";
        truck.color = "black";
        truck.numberOfTrailers = 123545;
        truck.printProperties();
        truck.engine = new Engine();
        truck.engine.horsePower = 1500;
        truck.engine.model = 2020;

    }
}

