package linkedlist;

public class LinkedList {
    public Node head;
    public int size;

    public void append(int data) {
        Node node = new Node(data);
        if (this.head != null) {
            Node pointer = this.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        }
        else {
            this.head = node;
        }
        this.size++;
    }

    public void insert(int data, int index) {

    }

    public boolean removeElement(int elem) {
        if (this.head == null) {
            throw new IllegalArgumentException(elem + " is not in the list");
        }
        else if (this.head.data == elem) {
            this.head = this.head.next;
            this.size--;
            return true;
        }
        else {
            Node predecessor = this.head;
            Node pointer = this.head.next;
            while (pointer != null) {
                if (pointer.data == elem) {
                    predecessor.next = pointer.next;
                    pointer.next = null;
                }
                predecessor = pointer;
                pointer = pointer.next;
            }
            this.size--;
            return true;
        }
    }

    //TODO: MAKE IT WORK CORRECTLY
    public boolean removeByIndex(int index) {
        if (this.head == null) {
            throw new IllegalArgumentException("List index out of range");
        }
        else if (index == 0) {
            this.head = this.head.next;
            this.size--;
            return true;
        }
        else {
            return true;
        }
    }

    public int index(int elem) {
        Node pointer = this.head;
        int index = 0;
        while (pointer != null) {
            if (pointer.data == elem) {
                return index;
            }
            pointer = pointer.next;
            index++;
        }
        throw new IllegalArgumentException(elem + "is not in the list");
    }

    public int getItem(int index) {
        Node pointer = this.head;
        for (int i = 0; i < index; i++) {
            if (pointer != null) {
                pointer = pointer.next;
            }
            throw new IndexOutOfBoundsException("List index out of range");
        }
        if (pointer != null) {
            return pointer.data;
        }
        throw new IndexOutOfBoundsException("List index out of range");
    }

    public void setItem(int index, int elem) {
        Node pointer = this.head;
        for (int i = 0; i < index; i++) {
            if (pointer != null) {
                pointer = pointer.next;
            }
            throw new IndexOutOfBoundsException("List index out of range");
        }
        if (pointer != null) {
            pointer.data = elem;
        }
        else {
            throw new IndexOutOfBoundsException("List index out of range");
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String r = "";
        Node pointer = this.head;
        while(pointer != null) {
            r += pointer.data + "->";
            pointer = pointer.next;
        }
        return r;
    }
}
