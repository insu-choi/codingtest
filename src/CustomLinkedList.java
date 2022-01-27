public class CustomLinkedList<T> {

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    public void add(T item) {
        if (head == null) {
            this.head = new Node<T>(item);
        } else {
            Node<T> target = this.head;
            while (target.next != null) {
                target = target.next;
            }
            target.next = new Node<T>(item);
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

    public Node<T> search(T item) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == item) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void addItemAfterData(T item, T data) {
        Node<T> targetNode = this.search(data);

        if (targetNode != null) {
            Node<T> newNode = new Node<T>(item);
            newNode.next = targetNode.next;
            targetNode.next = newNode;
        } else {
            this.add(item);
        }
    }

    public boolean delItem(T item) {
        if (this.head != null) {
            Node<T> node = this.head;
            if (node.data == item) {
                this.head = node.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == item)
                    {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
            }
        }
        return false;
    }
}
