
public class UserManager {
	public void add(User user) {
		System.out.println("eklendi.");
	}

	public void showInformation(User user) {
		
		System.out.println("First name: " + user.getFirstName());
		System.out.println("Last name: " + user.getLastName());
		System.out.println("listelendi");
	}
}
