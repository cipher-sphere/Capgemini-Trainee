
class MinHeap {

    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Get parent index
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Get left child index
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // Get right child index
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Swap two elements
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert element
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        size++;

        heapifyUp(size - 1);
    }

    // Heapify up (used in insert)
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    // Extract minimum element (root)
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return min;
    }

    // Heapify down (used in extractMin)
    private void heapifyDown(int index) {
        int smallest = index;

        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Peek minimum element
    public int peek() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        return heap[0];
    }

    // Print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}


// Testing class
public class Heap {
    public static void main(String[] args) {

        MinHeap heap = new MinHeap(10);

        heap.insert(20);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);
        heap.insert(40);

        heap.printHeap();

        System.out.println("Min element: " + heap.peek());

        System.out.println("Extracted: " + heap.extractMin());

        heap.printHeap();
    }
}
