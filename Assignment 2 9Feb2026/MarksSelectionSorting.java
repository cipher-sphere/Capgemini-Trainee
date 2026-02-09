package Sorting;

class Trainee {
    int rollno;
    String name;
    float cppmarks;
    float fullstack;
    float java;

    Trainee(int rollno, String name, float cppmarks, float fullstack, float java) {
        this.rollno = rollno;
        this.name = name;
        this.cppmarks = cppmarks;
        this.fullstack = fullstack;
        this.java = java;
    }
}

public class MarksSelectionSorting {
    public static void main(String[] args) {

        Trainee[] t = {
            new Trainee(1, "Aman", 80, 75, 70),
            new Trainee(2, "Ravi", 80, 75, 85),
            new Trainee(3, "Neha", 85, 60, 90),
            new Trainee(4, "Sita", 80, 70, 60)
        };

        for (int i = 0; i < t.length - 1; i++) {
            int bestIndex = i;

            for (int j = i + 1; j < t.length; j++) {
                if (isBetter(t[j], t[bestIndex])) {
                    bestIndex = j;
                }
            }

            Trainee temp = t[bestIndex];
            t[bestIndex] = t[i];
            t[i] = temp;
        }

        for (Trainee tr : t) {
            System.out.println(tr.rollno + " " + tr.name + " " +
                               tr.cppmarks + " " + tr.fullstack + " " + tr.java);
        }
    }

    static boolean isBetter(Trainee a, Trainee b) {
        if (a.cppmarks > b.cppmarks) return true;
        if (a.cppmarks == b.cppmarks && a.fullstack > b.fullstack) return true;
        if (a.cppmarks == b.cppmarks && a.fullstack == b.fullstack
                && a.java > b.java) return true;
        return false;
    }
}
