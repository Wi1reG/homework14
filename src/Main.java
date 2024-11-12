import com.sun.jdi.connect.Transport;

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
        station.check(cars[0]);
        station.check(cars[1]);
        station.check(truck[0]);
        station.check(truck[1]);
        station.check(bicycle[0]);
        station.check(bicycle[1]);

        ServiceStationForEmploee.print(cars);
        ServiceStationForEmploee.print(truck);
        ServiceStationForEmploee.print(bicycle);


    }
}