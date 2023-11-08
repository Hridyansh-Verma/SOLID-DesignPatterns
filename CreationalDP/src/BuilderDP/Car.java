package BuilderDP;

public class Car {
    private String name;
    private Brand brand;
    private int power;
    private int maxSpeed;
    private EngineType engineType;
    Car(CarBuilder carBuilder)
    {
        this.name=carBuilder.name;
        this.brand=carBuilder.brand;
        this.engineType=carBuilder.engineType;
        this.maxSpeed=carBuilder.maxSpeed;
        this.power=carBuilder.power;
    }
    @Override
    public String toString()
    {
        return "Car name: "+name+"\nCar brand:"+brand+"\nCar engineType:"+engineType+"\nCar power:"+power+"\nCar maxSpeed: "+maxSpeed;
    }
    public static CarBuilder getBuilder()
    {
        return new CarBuilder();
    }

    public static class CarBuilder
    {
        private String name;
        private Brand brand;
        private int power;
        private int maxSpeed;
        private EngineType engineType;

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setBrand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setEngineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }
    }
}
