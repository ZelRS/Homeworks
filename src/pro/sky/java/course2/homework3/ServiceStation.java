package pro.sky.java.course2.homework3;

public class ServiceStation implements VehicleService {
    @Override
    public void check(Bicycle bicycle) {
        separator();
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            System.out.print((i + 1) + "-е колесо. ");
            bicycle.updateTyre();
        }
    }

    @Override
    public void check(Car car) {
        separator();
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            System.out.print((i + 1) + "-е колесо. ");
            car.updateTyre();
        }
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        separator();
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            System.out.print((i + 1) + "-е колесо. ");
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    private static void separator() {
        System.out.println("=====================================");
    }

}
