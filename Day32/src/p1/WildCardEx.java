package p1;

import java.util.Arrays;

public class WildCardEx {

	public static void registerCourse(Course<?> course) { // ? 모든 과정
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));

	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Person("일반인"));
//		workerCourse.add(new Student("학생"));

		Course<Student> studentCourse = new Course<Student>("일반인과정", 5);
//		studentCourse.add(new Person("일반인"));
//		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);

//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);

	}

}
