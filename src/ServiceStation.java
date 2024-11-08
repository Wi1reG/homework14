public interface ServiceStation {
    default void check(Car car, Bicycle bicycle, Truck truck) {
        System.out.println("Данная информация только для сотрудников.");
    }
}
