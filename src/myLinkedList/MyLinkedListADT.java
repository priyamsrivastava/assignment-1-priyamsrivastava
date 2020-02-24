package myLinkedList;

public interface MyLinkedListADT<E> {
    void add(E item);

    E remove();

    int search(E item);


    MyLinkedListDefinitionClass<E> sort(MyLinkedListDefinitionClass<E> list);


    void swapAdjacentElements(Node<E> firstNode, Node<E> secondNode, int indexOfNodeBeforeFirstNode);

    void print();
}
