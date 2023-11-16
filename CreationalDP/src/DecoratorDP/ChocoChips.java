package DecoratorDP;

public class ChocoChips implements IceCreamConstituents{

    IceCreamConstituents iceCreamConstituents;
    ChocoChips(IceCreamConstituents iceCreamConstituents)
    {
        this.iceCreamConstituents=iceCreamConstituents;
    }
    @Override
    public int getCost() {
        return 6;
    }

    @Override
    public String getDescription() {
        if(iceCreamConstituents==null)
        {
            throw new IllegalArgumentException("No base ");
        }
        return "Chocolate CHip +"+iceCreamConstituents.getDescription();
    }
}
