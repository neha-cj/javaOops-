class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to delete a given element from the doubly linked list
    public void delete(int key) {
        Node current = head;

        // Find the node with the given key
        while (current != null && current.data != key) {
            current = current.next;
        }

        // If the node with the key is found, update the links to remove it
        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    // Method to display the contents of the doubly linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements into the doubly linked list
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);

        System.out.println("Doubly Linked List before deletion:");
        dll.display();

        // Delete a given element (e.g., 3) from the list
        int elementToDelete = 3;
        dll.delete(elementToDelete);

        System.out.println("Doubly Linked List after deletion of " + elementToDelete + ":");
        dll.display();
    }
}
