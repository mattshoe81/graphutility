package linkedlist;

public abstract class SinglyLinkedListSecondary<T>
        implements SinglyLinkedList<T> {

    /*
     * ************************************************************************
     * Object Superclass methods
     * ************************************************************************
     */
    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();

    @Override
    public abstract int hashCode();

}
