package Sorting;

class Student {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
}

public class ObjectBubbleSorting {

	public static void main(String[] args) {

		Student[] arr = { new Student(5, "Aman"), new Student(2, "Ravi"), new Student(8, "Neha"),
				new Student(1, "Shivam"), new Student(4, "Pooja"), new Student(3, "Kunal") };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j].rollno > arr[j + 1].rollno) {
					Student t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
