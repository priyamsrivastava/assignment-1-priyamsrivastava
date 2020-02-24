package myLinkedList;

public class MyLinkedListDefinitionClass<E> implements MyLinkedListADT {
    private Node<E> head = null;
    private int size;

    public Node<E> getNode(int index) {
        Node<E> response = head;

        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public void add(java.lang.Object item) {

    }

    @Override
    public java.lang.Object remove() {
        return null;
    }

    @Override
    public int search(java.lang.Object item) {
        return 0;
    }

    @Override
    public MyLinkedListDefinitionClass sort(MyLinkedListDefinitionClass list) {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public void swapAdjacentElements(Node firstNode, Node secondNode, int indexOfNodeBeforeFirstNode) {

    }
}
