class Node {
    String key;
    int value;
    Node next;

    Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {
    private Node[] table;
    private int size;

    public MyHashMap(int capacity) {
        table = new Node[capacity];
        size = capacity;
    }

    // Simple hash function
    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = hash + key.charAt(i);
        }
        return hash % size;
    }

    // PUT method
    public void put(String key, int value) {
        int index = hash(key);
        Node head = table[index];

        // If bucket empty
        if (head == null) {
            table[index] = new Node(key, value);
            return;
        }

        // Traverse linked list
        Node current = head;
        while (current != null) {
            // If key already exists → update value
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            if (current.next == null) break;
            current = current.next;
        }

        // Insert new node at end
        current.next = new Node(key, value);
    }

    // GET method
    public Integer get(String key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // key not found
    }

    // REMOVE method
    public void remove(String key) {
        int index = hash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next; // removing head
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Display method (for testing)
    public void display() {
        for (int i = 0; i < size; i++) {
            Node current = table[i];
            System.out.print("Bucket " + i + ": ");
            while (current != null) {
                System.out.print("(" + current.key + ", " + current.value + ") -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

// Main class for testing
public class Hashing {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(5);

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("grapes", 30);
        map.put("apple", 50); // update value

        System.out.println("Value of apple: " + map.get("apple"));
        System.out.println("Value of banana: " + map.get("banana"));

        map.remove("banana");

        map.display();
    }
}
