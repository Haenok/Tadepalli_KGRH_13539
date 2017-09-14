import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * A fix-sized array of students array length should always be equal to the
 * number of stored elements after the element was removed the size of the array
 * should be equal to the number of stored elements after the element was added
 * the size of the array should be equal to the number of stored elements null
 * elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given
 * class, interface or method DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * 
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		if (this.students.length == 0)
			throw new IllegalArgumentException("Array size is zero");

		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		if (this.students.length == 0)
			throw new IllegalArgumentException("Array size is zero");
		Student[] students1 = new Student[this.students.length + 1];

		students1[0] = student;

		int i = 0;
		int x = 1;
		while (i < students.length) {

			students1[x] = students[i];
			i++;
			x++;
		}

		this.students = students1;
	}

	@Override
	public void addLast(Student student) {

		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		if (this.students.length == 0)
			throw new IllegalArgumentException("Array size is zero");
		Student[] students1 = new Student[this.students.length + 1];

		int i = 0;
		int x = 0;
		while (i < students.length) {

			students1[x] = students[i];
			i++;
			x++;
		}

		students1[students1.length - 1] = student;

		this.students = students1;
	}

	@Override
	public void add(Student student, int index) {
		// Check for invalid parameters

		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		if (index > this.students.length - 1)
			throw new IllegalArgumentException("Invalid array index");

		this.students[index] = student;
	}

	@Override
	public void remove(int index) {

		if (index > this.students.length - 1)
			throw new IllegalArgumentException("Invalid array index");

		
		// this.students[index] = null;

		
		Student[] students1 = new Student[this.students.length - 1];

		/*
		 * for(int i = 0; i < this.students.length-1; i++) { int position = -1;
		 * 
		 * if(this.students[i] != null) { position++; students1[position] =
		 * this.students[i]; } }
		 */

		int i = 0;
		int x = 0;
		while (i < students.length) {
			if (i == index) {
				i++;
			}

			students1[x] = students[i];
			i++;
			x++;
		}

		this.students = students1;

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		int index = getStudentIndex(student);

		/*
		 * if(index >= 0) { this.students[index] = null; }
		 */

		
		Student[] students1 = new Student[this.students.length - 1];

		int i = 0;
		int x = 0;
		while (i < students.length) {
			if (i == index) {
				i++;
			}

			students1[x] = students[i];
			i++;
			x++;
		}

		this.students = students1;

	}

	@Override
	public void removeFromIndex(int index) {

		if (index > this.students.length - 1)
			throw new IllegalArgumentException("Invalid array index");

		
		// this.students[index] = null;

		
		Student[] students1 = new Student[this.students.length - 1];

		/*
		 * for(int i = 0; i < this.students.length-1; i++) { int position = -1;
		 * 
		 * if(this.students[i] != null) { position++; students1[position] =
		 * this.students[i]; } }
		 */

		int i = 0;
		int x = 0;
		while (i < students.length) {
			if (i == index) {
				i++;
			}

			students1[x] = students[i];
			i++;
			x++;
		}

		this.students = students1;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		int index = getStudentIndex(student);

		/*
		 * if(index >= 0) { this.students[index] = null; }
		 */

		
		Student[] students1 = new Student[this.students.length - 1];

		int i = 0;
		int x = 0;
		while (i < students.length) {
			if (i == index) {
				i++;
			}

			students1[x] = students[i];
			i++;
			x++;
		}

		this.students = students1;
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for (int a = 1; a < students.length; a++) {
			for (int b = 0; b < students.length - a; b++) {
				if (students[b].getId() > (students[b + 1].getId())) {
					
					Student temp = students[b];
					students[b] = students[b + 1];
					students[b + 1] = temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here

		int i = 0;
		ArrayList<Student> list = new ArrayList();

		while (i < students.length) {

			if (students[i].getBirthDate().compareTo(date) == 0) {

				list.add(students[i]);
			}

			i++;
		}

		Student[] newStudents = new Student[list.size()];

		int x = 0;

		while (x < list.size()) {

			newStudents[x] = list.get(x);
			x++;
		}

		return newStudents;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return calculateAge(this.students[indexOfStudent].getBirthDate());
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here

		int i = 0;
		ArrayList<Student> list = new ArrayList();

		while (i < students.length) {

			if (this.calculateAge(students[i].getBirthDate()) == age) {
				list.add(students[i]);
			}

			i++;
		}

		Student[] newStudents = new Student[list.size()];

		int x = 0;

		while (x < list.size()) {

			newStudents[x] = list.get(x);
			x++;
		}

		return newStudents;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		if (student == null)
			throw new IllegalArgumentException("Null student object detected");

		int i = 0;
		Student match = null;

		while (i < students.length) {

			if (students[i].compareTo(student) == 0) {
				if (i < students.length - 1) {
					match = students[++i];
					break;
				}
			}

			i++;
		}

		return match;
	}

	public int calculateAge(Date birthdate) {
		Calendar birth = Calendar.getInstance();
		birth.setTime(birthdate);
		Calendar today = Calendar.getInstance();

		int yearDifference = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

		if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)) {
			yearDifference--;
		} else {
			if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)
					&& today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH)) {
				yearDifference--;
			}

		}
		return yearDifference;
	}

	private int getStudentIndex(Student student) {
		
		if (student == null)
			throw new IllegalArgumentException("Null student object detected");
		
		int position = -1;

		for (int i = 0; i < this.students.length - 1; i++) {
			if (student.getId() == this.students[i].getId())
				position = i;
		}

		return position;
	}

}
