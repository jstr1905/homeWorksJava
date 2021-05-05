
public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 0);

		Lesson lesson2 = new Lesson();
		lesson2.id = 2;
		lesson2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + REACT)";
		lesson2.instructor = "Engin Demiroð";
		lesson2.progress = 44;

		Lesson[] lessons = { lesson1, lesson2 };

		for (Lesson lesson : lessons) {
			System.out.println("Kurs ID: " + lesson.id);
			System.out.println("Kurs Adý: " + lesson.courseName);
			System.out.println("Kurs Eðitmen Adý: " + lesson.instructor);
			System.out.println("Ýlerleme % " + lesson.progress);
			System.out.println("--------------------------------");
		}

		Student student1 = new Student(1, "Yusuf", "Yýldýz", "yusfair12@gmail.com", 20);
		Student student2 = new Student();

		student2.id = 2;
		student2.name = "Mehmet";
		student2.surname = "Yýlmaz";
		student2.email = "mehmetylmz10@gmail.com";
		student2.age = 19;
		Student[] students = { student1, student2 };
		for (Student student : students) {

			System.out.println("Öðrenci ID: " + student.id);
			System.out.println("Öðrenci Adý: " + student.name);
			System.out.println("Öðrenci Soyadý: " + student.surname);
			System.out.println("Öðrenci Email: " + student.email);
			System.out.println("Öðrenci Yaþý: " + student.age);
			System.out.println("--------------------------------");
		}

		CourseManager courseManager = new CourseManager();
		courseManager.participate(lesson2);
		courseManager.finish(lesson2);
		courseManager.progress(lesson2);

	}

}
