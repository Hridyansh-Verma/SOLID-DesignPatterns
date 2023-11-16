package DecoratorDP;

public class OrangeCone implements IceCreamConstituents{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return " Orange Cone";
    }
}
