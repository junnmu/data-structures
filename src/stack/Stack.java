package stack;

public class Stack {
    public Node top;
    public int size;

    public void push(int data) {
        Node node = new Node(data);
        node.next = this.top;
        this.top = node;
        this.size++;
    }

    public int pop() throws Exception {
        if (this.size > 0) {
            int elem = this.top.data;
            this.top = this.top.next;
            this.size--;
            return elem;
        }
        throw new Exception("The stack is empty");
    }

    public int peek() throws Exception {
        if (this.size > 0) {
            return this.top.data;
        }
        throw new Exception("The stack is empty");
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String r = "";
        Node pointer = this.top;
        while (pointer != null) {
            r += pointer.data + "\n";
            pointer = pointer.next;
        }
        return r;
    }
}
