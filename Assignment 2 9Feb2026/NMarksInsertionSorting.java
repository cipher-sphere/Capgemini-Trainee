package Sorting;

class TraineeN {
    int rollno;
    String name;
    float[] marks;

    TraineeN(int rollno, String name, float[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class NMarksInsertionSorting {

    public static void main(String[] args) {

        TraineeN[] t = {
            new TraineeN(1, "Aman", new float[]{80, 75, 70, 60}),
            new TraineeN(2, "Ravi", new float[]{80, 75, 85, 50}),
            new TraineeN(3, "Neha", new float[]{85, 60, 90, 70}),
            new TraineeN(4, "Sita", new float[]{80, 70, 60, 90})
        };

        for (int i = 1; i < t.length; i++) {
            TraineeN key = t[i];
            int j = i - 1;

            while (j >= 0 && shouldShift(t[j], key)) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = key;
        }

        for (TraineeN tr : t) {
            System.out.print(tr.rollno + " " + tr.name + " ");
            for (float m : tr.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static boolean shouldShift(TraineeN a, TraineeN b) {
        for (int i = 0; i < a.marks.length; i++) {
            if (a.marks[i] < b.marks[i]) return true;
            if (a.marks[i] > b.marks[i]) return false;
        }
        return false;
    }
}
