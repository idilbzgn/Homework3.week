
public class Main {
public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("�dil ");
		user.setLastName("Bezgin");
		
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin\n");
		instructor.setLastName("Demiro�");
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("a�elya");
		student.setLastName("�i�ek");
		
		
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setFirstName("hatice");
		student1.setLastName("bezgin");
		
		
		
		Student[] students = {student,student1};
		
		StudentManager studentManager = new StudentManager();
		

	}

}
