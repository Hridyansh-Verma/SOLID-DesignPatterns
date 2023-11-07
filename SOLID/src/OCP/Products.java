package OCP;

import java.util.List;
import java.util.stream.Stream;

public class Products {
    public String name;
    public Color color;
    public Size size;

    public Products(String name,Color color, Size size) {
        this.color = color;
        this.size = size;
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Product is : Name-"+this.name+ " Color-"+this.color+" Size-"+this.size;
    }
}
