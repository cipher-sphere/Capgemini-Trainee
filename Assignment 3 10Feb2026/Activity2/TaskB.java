import java.util.LinkedList;

public class TaskB {

    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Patient A");
        queue.add("Patient B");
        queue.add("Patient C");
        queue.add("Patient D");
        queue.add("Patient E");

        queue.addFirst("Emergency Patient");

        queue.remove();
        queue.remove();

        System.out.println("Current Queue: " + queue);
    }
}
