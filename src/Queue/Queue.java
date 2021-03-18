package Queue;

public class Queue {
    public Node first;
    public Node last;
    public int size;

    public void push(int data) {
        Node node = new Node(data);
        if (this.last == null && this.first == null) {
            this.first = node;
        }
        else {
            this.last.next = node;
        }
        this.last = node;
        this.size++;
    }

    public int pop() throws Exception {
        if (this.size > 0) {
            int elem = this.first.data;
            this.first = this.first.next;
            this.size--;
            return elem;
        }
        else {
            throw new Exception("The queue is empty");
        }
    }

    public int peek() throws Exception {
        if (this.size > 0) {
            return this.first.data;
        }
        else {
            throw new Exception("The queue is empty");
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String r = "";
        if (this.size > 0) {
            Node pointer = this.first;
            while (pointer != null) {
                r += pointer.data + " ";
                pointer = pointer.next;
            }
            return r;
        }
        return r;
    }
}
