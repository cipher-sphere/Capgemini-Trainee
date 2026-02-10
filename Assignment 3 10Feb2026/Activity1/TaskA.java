import java.util.ArrayList;
import java.util.Collections;

public class TaskA {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(85);
        marks.add(67);
        marks.add(90);
        marks.add(72);

        System.out.println("Initial Marks: " + marks);

        marks.add(2, 88);
        System.out.println("After inserting at index 2: " + marks);

        int lowestMark = Collections.min(marks);
        marks.remove(Integer.valueOf(lowestMark));

        System.out.println("Final Marks after removing lowest (" + lowestMark + "): " + marks);
    }
}
