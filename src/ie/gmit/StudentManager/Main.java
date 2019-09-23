package ie.gmit.StudentManager;


public class Main {
    
	public static void main(String[] args) {
		
	        // Create a new menu object
	    	Menu menuObj1 = new Menu();
	    	// Run the start method of the Menu object 
	    	menuObj1.start();	
		
		Student student1 = new Student("G0022222");
		System.out.println(student1.getStudentId());
		
	}
	
}
