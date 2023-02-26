package LinkedList;
public class LinkedList {
    Node head; // head of the list
 
    static class Node {
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    // Method to delete a node with a given key
    public void deleteNode(int key) {
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change prev.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
 
    // Method to display the contents of the linked list
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 
    // Method to search for a node with a given key
    public Node search(int key) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        return current;
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 
        // Insert some nodes at the beginning of the list
        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtBeginning(15);
 
        // Print the contents of the list
        System.out.println("Initial list:");
        list.displayList();
 
        // Search for a node and print its value
        System.out.println("Search for 10:");
        Node node = list.search(10);
        if (node != null) {
            System.out.println("Node found: " + node.data);
        } else {
            System.out.println("Node not found");
        }
 
        // Delete a node and print the contents of the list
        System.out.println("Delete 10:");
        list.deleteNode(10);
        list.displayList();
    }
}
