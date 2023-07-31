package libraryManagement;

public class Students {

	Student studentNumber1 = new Student("Blessy", "21");
	Student studentNumber2 = new Student("Ammu", "22");
	Student studentNumber3 = new Student("Derry", "23");

	Student theStudents[] = { studentNumber1, studentNumber2, studentNumber3 };

	void showAllStudents() {
		System.out.println("Name\t\tRegister Number");
		for (int i = 0; i < theStudents.length; i++) {

			System.out.println(theStudents[i].studentName + "\t\t" + theStudents[i].registerNumber);
		}
	}
}
