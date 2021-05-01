
public class Instructor extends User{

		private String description;
		
		public Instructor() {
			
		}

		public Instructor(int id, String firstName, String lastName) {
			super();
			this.setId(id);
			this.setFirstName(firstName);
			this.setLastName(lastName);
			
		}
}
