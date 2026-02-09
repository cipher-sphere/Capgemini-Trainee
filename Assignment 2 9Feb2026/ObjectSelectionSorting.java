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

public class ObjectSelectionSorting {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(5, "Aman"),
            new Student(2, "Ravi"),
            new Student(8, "Neha"),
            new Student(1, "Shivam"),
            new Student(4, "Pooja"),
            new Student(3, "Kunal")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].rollno < arr[minIndex].rollno) {
                    minIndex = j;
                }
            }

            Student temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
