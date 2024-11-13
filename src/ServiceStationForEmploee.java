public class ServiceStationForEmploee implements ServiceStation {


    public static void print(Car[] cars) {
        System.out.println("Машины в сервисе: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getModelName());
        }
    }

}