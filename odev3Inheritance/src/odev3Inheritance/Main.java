package odev3Inheritance;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(2000, "Yusuf YILDIZ", "yusfair12@gmail.com");

		Instructor instructor = new Instructor(1900, "Engin Demiroğ",
				"Microsoft Certified Trainer (MCT) ,PMP and ITIL ", "5554449966");

		StudentManager studentManager = new StudentManager();
		studentManager.sign(student);
		studentManager.login(student);
		studentManager.delete(student);
		studentManager.logout(student);

		System.out.println("*********************************");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.sign(instructor);
		instructorManager.login(instructor);
		instructorManager.update(instructor);
		instructorManager.logout(instructor);
	}

}
