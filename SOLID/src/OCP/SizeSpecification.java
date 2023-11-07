package OCP;

import OCP.filterinterface.Specifications;

public class SizeSpecification implements Specifications<Products> {
    Size size;
    SizeSpecification(Size size)
    {
        this.size=size;
    }
    @Override
    public boolean isSatisfied(Products item) {
        return item.size==size;
    }
}
