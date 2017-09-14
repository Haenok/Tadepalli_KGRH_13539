import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		Student student = new Student(8, "Haenok Tadepalli", new Date("10/21/2000"), 90);
		
		//System.out.println(student.getFullName());
		//System.out.print(student.getBirthDate());
		
		StudentGroup group = new StudentGroup(8);
		group.add(student, 0);
		group.add(new Student(2, "Chinnu", new Date("10/21/2000"), 70), 1);
		group.add(new Student(3, "Chinnu", new Date("10/21/2000"), 70), 2);
		group.add(new Student(4, "Chinnu", new Date("10/21/2000"), 70), 3);
		group.add(new Student(5, "Chinnu", new Date("10/21/2002"), 70), 4);
		group.add(new Student(6, "Chinnu", new Date("10/21/2001"), 70), 5);
		group.add(new Student(7, "Chinnu", new Date("10/21/2004"), 70), 6);
		group.add(new Student(0, "Chinnu", new Date("08/20/2001"), 70), 7);
		//System.out.println(group.getStudents().length);

		//group.addLast(new Student(8, "Chinnu", new Date("08/20/1974"), 70));
		//group.addFirst(new Student(8, "Chinnu", new Date("08/20/1974"), 70));
		
		//Student[] students = group.getByBirthDate(new Date("10/21/2000"));
		
		//System.out.println(group.getCurrentAgeByDate(2));
		//Student[] students = group.getStudentsByAge(50);
		
		//Student student1 = group.getNextStudent(student);
		
		group.bubbleSort();
		
		Student[] students2 = group.getStudents();
		
		String s;
		
		
		//System.out.println(group.getStudents().length);

		//group.addFirst(student);
		//group.addLast(new Student(2, "Chinnu", null, 0));

		//System.out.println(group.getStudents().length);
		//System.out.println(group.getStudent(1).getId());
		//System.out.println(group.getStudents().length);

		//group.remove(student);
		//System.out.println(group.getStudent(0).getId());

		//System.out.println(group.getStudents().length);

		//System.out.println(group.getStudent(1).getId());


		//Student student2 = group.getStudent(1);
		
		//System.out.print(student2.getFullName());
				
	}

}
