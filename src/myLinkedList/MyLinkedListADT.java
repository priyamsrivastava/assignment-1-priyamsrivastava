package myLinkedList;

public interface MyLinkedListADT<E> {

    E remove();

    void add(E item);

    int search(E item);


    MyLinkedListDefinitionClass<E> sort(MyLinkedListDefinitionClass<E> list);


    void swapAdjacentElements(Node<E> firstNode, Node<E> secondNode, int indexOfNodeBeforeFirstNode);

    void print();
}
