package OCP.filterinterface;

public interface Specifications<T> {
    boolean isSatisfied(T item);
}
