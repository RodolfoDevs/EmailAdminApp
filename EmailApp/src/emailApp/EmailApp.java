package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an instance of Email to test constructor
		Email em1 = new Email("John", "Doe");
		
		em1.setAlternateEmail("johndoe2@abcxyz.com");
		em1.setMailboxCapacity(1000);
		
		//Print information of the new worker
		System.out.println(em1.showInfo());
		
	}

}