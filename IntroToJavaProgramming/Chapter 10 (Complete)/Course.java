public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		
		if(numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < students.length; i++) {
			if(student.equals(students[i])) {
				students[i] = "";
				numberOfStudents--;
				break;
			}
		}
	}
	
	public void clear() {
		for(int i = 0; i < students.length; i++) {
			numberOfStudents--;
		}
		
		System.out.println("Course cleared");
	}
}