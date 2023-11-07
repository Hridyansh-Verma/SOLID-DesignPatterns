package OCP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products("X",Color.GREEN,Size.LARGE));
        productsList.add(new Products("y",Color.SAFFRON,Size.MEDIUM));
        productsList.add(new Products("Z",Color.BLACK,Size.LARGE));
        productsList.add(new Products("A",Color.RED,Size.EXTRA_LARGE));

        ProductFilterBad productFilterBad= new ProductFilterBad();
        System.out.println("Streaming filtered products:");
        productFilterBad.filterByColor(productsList,Color.RED).forEach(p-> System.out.println("-- "+p.name));
        SizeFilter sizeFilter= new SizeFilter();
        sizeFilter.filter(productsList,new ColorSpecification(Color.SAFFRON)).forEach(p-> System.out.println(p.name+" "+p.color+" "+p.size));
    }
}
