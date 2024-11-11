public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void getService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check (Truck truck) {

        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            System.out.println();
        }


    }
}