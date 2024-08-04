public class LLcycle {
    private Node head;
    private int size;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public boolean isCycle(LLcycle list) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 1; i < list.size ; i++) {
            p2 = p2.next;
        }
        while (p1 != p2) {

            if (p2.next == null) {
                return false;
            }
            if (p2.next == p1) {
                return true;

            }
            p1 = p1.next;

        }
        return true;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("end");
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LLcycle l1 = new LLcycle();
        l1.insertFirst(1);
        l1.insertFirst(2);
        l1.insertFirst(11);
        l1.insertFirst(14);
        // l1.display();
        l1.tail.next=l1.head.next;
        System.out.println(l1.isCycle(l1));
        // l1.display();
    }

}
