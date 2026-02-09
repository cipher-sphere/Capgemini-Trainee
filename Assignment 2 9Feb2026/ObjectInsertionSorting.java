package Sorting;

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
}

public class ObjectInsertionSorting {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(5, "Aman"),
            new Student(2, "Ravi"),
            new Student(8, "Neha"),
            new Student(1, "Shivam"),
            new Student(4, "Pooja"),
            new Student(3, "Kunal")
        };

        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].rollno > key.rollno) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
