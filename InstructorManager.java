public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {

		System.out.println("ID'si : " + instructor.getId() 
						 + "Ad� : " + instructor.getFirstName()
						 + "soyad� :"   + instructor.getLastName());
	}
						

	public void addMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			add(instructor);
		}
	}

}