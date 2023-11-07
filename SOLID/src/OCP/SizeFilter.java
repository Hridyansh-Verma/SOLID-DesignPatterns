package OCP;

import OCP.filterinterface.Filter;
import OCP.filterinterface.Specifications;

import java.util.List;
import java.util.stream.Stream;

public class SizeFilter implements Filter<Products> {

    @Override
    public Stream<Products> filter(List<Products> items, Specifications<Products> spec) {
        return items.stream().filter(p-> spec.isSatisfied(p));
    }
}
