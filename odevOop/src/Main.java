
public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 0);

		Lesson lesson2 = new Lesson();
		lesson2.id = 2;
		lesson2.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT)";
		lesson2.instructor = "Engin Demiro�";
		lesson2.progress = 44;

		Lesson[] lessons = { lesson1, lesson2 };

		for (Lesson lesson : lessons) {
			System.out.println("Kurs ID: " + lesson.id);
			System.out.println("Kurs Ad�: " + lesson.courseName);
			System.out.println("Kurs E�itmen Ad�: " + lesson.instructor);
			System.out.println("�lerleme % " + lesson.progress);
			System.out.println("--------------------------------");
		}

		Student student1 = new Student(1, "Yusuf", "Y�ld�z", "yusfair12@gmail.com", 20);
		Student student2 = new Student();

		student2.id = 2;
		student2.name = "Mehmet";
		student2.surname = "Y�lmaz";
		student2.email = "mehmetylmz10@gmail.com";
		student2.age = 19;
		Student[] students = { student1, student2 };
		for (Student student : students) {

			System.out.println("��renci ID: " + student.id);
			System.out.println("��renci Ad�: " + student.name);
			System.out.println("��renci Soyad�: " + student.surname);
			System.out.println("��renci Email: " + student.email);
			System.out.println("��renci Ya��: " + student.age);
			System.out.println("--------------------------------");
		}

		CourseManager courseManager = new CourseManager();
		courseManager.participate(lesson2);
		courseManager.finish(lesson2);
		courseManager.progress(lesson2);

	}

}
