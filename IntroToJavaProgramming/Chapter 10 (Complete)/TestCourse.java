public class TestCourse {
	public static void main(String[] args) {
		
		// Create course
		Course physics = new Course("Physics");
		
		// Add three students
		physics.addStudent("Goobedy Goo");
		physics.addStudent("Maximillian");
		physics.addStudent("Hallo Der!");
		
		// Remove one
		physics.dropStudent("Hallo Der!");
		
		// Display students
		String[] list = physics.getStudents();
		for(int i = 0; i < physics.getNumberOfStudents(); i++)
			System.out.print(list[i] + ", ");
		
		System.out.println();
		
		// Clear course
		physics.clear();
	}
}