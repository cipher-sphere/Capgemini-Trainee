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

public class NMarksSelectionSorting {

    public static void main(String[] args) {

        TraineeN[] t = {
            new TraineeN(1, "Aman", new float[]{80, 75, 70, 60}),
            new TraineeN(2, "Ravi", new float[]{80, 75, 85, 50}),
            new TraineeN(3, "Neha", new float[]{85, 60, 90, 70}),
            new TraineeN(4, "Sita", new float[]{80, 70, 60, 90})
        };

        for (int i = 0; i < t.length - 1; i++) {
            int bestIndex = i;

            for (int j = i + 1; j < t.length; j++) {
                if (isBetter(t[j], t[bestIndex])) {
                    bestIndex = j;
                }
            }

            TraineeN temp = t[bestIndex];
            t[bestIndex] = t[i];
            t[i] = temp;
        }

        for (TraineeN tr : t) {
            System.out.print(tr.rollno + " " + tr.name + " ");
            for (float m : tr.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static boolean isBetter(TraineeN a, TraineeN b) {
        for (int i = 0; i < a.marks.length; i++) {
            if (a.marks[i] > b.marks[i]) return true;
            if (a.marks[i] < b.marks[i]) return false;
        }
        return false;
    }
}