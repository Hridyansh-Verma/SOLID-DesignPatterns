package DecoratorDP;

public class ChocolateCone implements IceCreamConstituents{
    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return " Chocolate Cone";
    }
}
