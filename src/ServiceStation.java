public interface ServiceStation {
    default void check(Car car) { car.getService();  }
}
