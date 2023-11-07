package OCP;

import OCP.filterinterface.Specifications;

public class ColorSpecification implements Specifications<Products> {
    Color color;
    ColorSpecification(Color color)
    {
        this.color=color;
    }
    @Override
    public boolean isSatisfied(Products item) {
        return item.color==color;
    }
}