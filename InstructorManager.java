public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {

		System.out.println("ID'si : " + instructor.getId() 
						 + "Adý : " + instructor.getFirstName()
						 + "soyadý :"   + instructor.getLastName());
	}
						

	public void addMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			add(instructor);
		}
	}

}