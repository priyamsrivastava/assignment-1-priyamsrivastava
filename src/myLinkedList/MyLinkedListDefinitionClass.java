package myLinkedList;

public class MyLinkedListDefinitionClass<E> implements MyLinkedListADT<E> {
    private Node<E> head = null;
    private int size;

    public Node<E> getNode(int index) {
        Node<E> response = head;

        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(E item) {
        head = new Node<E>(item, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        node.setNext(new Node<E>(item, node.getNext()));
        size++;
    }


    @Override
    public void add(E data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node<E> temp = getNode(index - 1);
            addAfter(temp, data);
        }
    }


    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public MyLinkedListDefinitionClass sort(MyLinkedListDefinitionClass list) {
        return null;
    }


    @Override
    public E remove() {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public void swapAdjacentElements(Node firstNode, Node secondNode, int indexOfNodeBeforeFirstNode) {

    }
}
