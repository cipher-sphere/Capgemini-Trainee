import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskA {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 3);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        list.sort(Collections.reverseOrder());

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Final List: " + list);
    }
}
