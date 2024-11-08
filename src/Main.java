public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Car1", 4),
                new Car("Car2", 4)
        };

        Truck[] truck = {
                new Truck("Truck1", 6),
                new Truck("Truck2", 8),
        };

        Bicycle[] bicycle = {
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 2)
        };

        ServiceStation station = new ServiceStationForEmploee();
        station.check(cars[0], null, null);
        station.check(cars[1], null, null);
        station.check(null, bicycle[0], null);
        station.check(null, bicycle[1], null);
        station.check(null, null, truck[0]);
        station.check(null, null, truck[1]);

        ServiceStationForEmploee.print(cars);
        ServiceStationForEmploee.print(truck);
        ServiceStationForEmploee.print(bicycle);


    }
}