
public class CourseManager {

	public void participate(Lesson lesson) {

		System.out.println(lesson.courseName + " adlý kursa katýldýnýz");

	}

	public void finish(Lesson lesson) {

		System.out.println(lesson.courseName + " adlý kursu bitirdiniz");

	}

	public void progress(Lesson progress) {

		System.out.println("%" + progress.progress + " ilerleme saðladýnýz");

	}
}
