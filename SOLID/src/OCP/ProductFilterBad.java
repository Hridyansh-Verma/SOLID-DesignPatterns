package OCP;

import java.util.List;
import java.util.stream.Stream;

class ProductFilterBad
{
    public Stream<Products> filterByColor(List<Products> products, Color color)
    {
        return products.stream().filter(p->p.color==color);
    }
    public Stream<Products> filterBySize(List<Products> products,Size size)
    {
        return products.stream().filter(p->p.size==size);
    }
    public Stream<Products> filterByColor(List<Products> products,Color color,Size size)
    {
        return products.stream().filter(p->p.color==color&&p.size==size);
    }
}
