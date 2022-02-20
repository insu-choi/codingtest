package lecture;

public class CustomDoubleLinkedList<T> {

    public class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    public void add(T item) {
        if (this.head == null) {
            this.head = new Node<T>(item);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(item);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> searchFromHead(T item) {
        if (this.head != null) {
            Node<T> target = this.head;
            while (target != null) {
                if (target.data == item) {
                    return target;
                } else {
                    target = target.next;
                }
            }
        }
        return null;
    }

    public Node<T> searchFromTail(T item) {
        if (this.head != null) {
            Node<T> target = this.tail;
            while (target != null) {
                if (target.data == item) {
                    return target;
                } else {
                    target = target.prev;
                }
            }
        }
        return null;
    }

    public boolean addItemAfterData(T item, T data) {
        Node<T> targetNode = this.searchFromHead(data);
        if (targetNode != null) {
            Node<T> backNode = targetNode.next;
            targetNode.next = new Node<T>(item);
            targetNode.next.next = backNode;
            targetNode.next.prev = targetNode;
            backNode.prev = targetNode.next;
            return true;
        }
        return false;
    }
}
