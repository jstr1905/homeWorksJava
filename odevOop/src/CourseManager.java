
public class CourseManager {

	public void participate(Lesson lesson) {

		System.out.println(lesson.courseName + " adl� kursa kat�ld�n�z");

	}

	public void finish(Lesson lesson) {

		System.out.println(lesson.courseName + " adl� kursu bitirdiniz");

	}

	public void progress(Lesson progress) {

		System.out.println("%" + progress.progress + " ilerleme sa�lad�n�z");

	}
}
