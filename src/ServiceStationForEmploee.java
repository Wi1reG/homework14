public class ServiceStationForEmploee extends Object implements ServiceStation {


//    @Override
//    public void check(Car car, Bicycle bicycle, Truck truck) {
//        System.out.println("Информация для сотрудников:");
//        if (car != null) {
//            System.out.println("Обслуживаем " + car.getModelName());
//            for (int i = 0; i < car.getWheelsCount(); i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//            System.out.println();
//
////        } else if (truck != null) {
////            System.out.println("Обслуживаем " + truck.getModelName());
////            for (int i = 0; i < truck.getWheelsCount(); i++) {
////                truck.updateTyre();
////
////            }
////            truck.checkEngine();
////            truck.checkTrailer();
////            System.out.println();
//
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.getModelName());
//            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//                bicycle.updateTyre();
//
//            }
//            System.out.println();
//
//        }
//    }


    public static void print(Car[] cars) {
        System.out.println("Машины в сервисе: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getModelName());
        }
    }

}