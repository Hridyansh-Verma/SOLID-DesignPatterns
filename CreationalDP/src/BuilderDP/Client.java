package BuilderDP;

public class Client {
    public static void main(String[] args) {
        Car car= Car.getBuilder()
                .setBrand(Brand.FORTUNER)
                .setEngineType(EngineType.MANUAL)
                .setMaxSpeed(323)
                .build();
        System.out.println(car);
    }
}
