package runner;

import classes.Student;

public class TestStudentEqa {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = st1;
		System.out.println("-------------");
		System.out.println(st1 == st2);
		System.out.println(st1 != st2);
		System.out.println("--------------");
		System.out.println(st1 == st3);
		System.out.println(st1 != st3);
		System.out.println("////////////");
		System.out.println(st2 == st3);
		System.out.println(st2 != st3);
	}

}
