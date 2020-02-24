package myLinkedList;

public class MyLinkedListDefinitionClass<E> implements MyLinkedListADT<Object> {
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

    public void add(int index, E data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node<E> temp = getNode(index - 1);
            addAfter(temp, data);
        }
    }

    public void add(E item) {
        add(size, item);
    }

    private E removeFirst() {
        E response = null;

        Node<E> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    private E removeAfter(Node<E> node) {
        E response = null;
        Node<E> temp = node.getNext();

        if (temp != null) {
            node.setNext(temp.getNext());
            size--;
            response = temp.getData();
        }
        return response;
    }

    public E remove(int index) {
        E response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = remove();
        } else {
            Node<E> previousNode = getNode(index - 1);
            response = removeAfter(previousNode);
        }
        return response;
    }

    @Override
    public E remove() {
        return remove(size - 2);
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public MyLinkedListDefinitionClass<E> sort(MyLinkedListDefinitionClass<E> list) {
        for (int i = 0; i < list.getSize(); i++) {
            for (int j = 1; j < list.getSize() - i; j++) {
                Person firstNode = (Person) getNode(j - 1).getData();
                Person secondNode = (Person) getNode(j).getData();
                if (firstNode.getFirstName().compareToIgnoreCase(secondNode.getFirstName()) > 0) {
                    list.swapAdjacentElements(getNode(j - 1), getNode(j), j - 2);
                }
            }
        }
        return list;
    }


    @Override
    public void swapAdjacentElements(Node<E> firstNode, Node<E> secondNode, int indexOfNodeBeforeFirstNode) {
        if (head == firstNode) {
            head = secondNode;
            Node<E> reference = secondNode.getNext();
            secondNode.setNext(firstNode);
            firstNode.setNext(reference);
        } else {
            Node<E> previous = getNode(indexOfNodeBeforeFirstNode);
            previous.setNext(secondNode);
            Node<E> reference = secondNode.getNext();
            secondNode.setNext(firstNode);
            firstNode.setNext(reference);
        }
    }

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            E data = getNode(i).getData();
            System.out.print(data + "  " + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    @Override
    public String toString() {
        return "";
    }


    public int getSize() {
        return size;
    }
}
}
