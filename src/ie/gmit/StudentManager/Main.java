package ie.gmit.StudentManager;


public class Main {
    
	public static void main(String[] args) {
		
	    // Create a new menu object
	    Menu menuObj1 = new Menu();
	    // Run the start method of the Menu object 
	    menuObj1.start();	
		
	    StudentManager sm1 = new StudentManager();	
	    
	    Student student1 = new Student("G0022222");
	    Student student2 = new Student("G0033333");
		Student student3 = new Student("G0044444");
	    
	    sm1.add(student1);
	    sm1.add(student2);
	    sm1.add(student3);
	    
	    System.out.println(sm1.findTotalStudents());
	    
	    sm1.delete(student1);
	    
	    System.out.println(sm1.findTotalStudents());
	    
	    Menu menuObject1 = new Menu();
	    menuObject1.display();
	    
	 
	    
	  //  System.out.println(sm1.students.size());
	  
	    
	    
	    
	   /*
		Student student2 = new Student("G0033333");
		Student student3 = new Student("G0044444");
		Student student4 = new Student("G0055555");
		Student student5 = new Student("G0066666");
		Student student6 = new Student("G0077777");
		Student student7 = new Student("G0088888");
		Student student8 = new Student("G0099999");
		Student student9 = new Student("G0012121");
		Student student10 = new Student("G0011111");
		Student student11 = new Student("G0031313");*/
		
		
		/*boolean status;
		int numOfStudents;*/
		
		/*status = sm1.add(student1);
		System.out.println(status);*/
		
		/*status = sm1.add(student2);
		System.out.println(status);
		
		status = sm1.add(student3);
		System.out.println(status);
		
		status = sm1.add(student4);
		System.out.println(status);
		
		status = sm1.add(student5);
		System.out.println(status);
		
		status = sm1.add(student6);
		System.out.println(status);
		
		status = sm1.add(student7);
		System.out.println(status);
		
		status = sm1.add(student8);
		System.out.println(status);
		
		status = sm1.add(student9);
		System.out.println(status);
		
		status = sm1.add(student10);
		System.out.println(status);
		
		status = sm1.add(student11);
		System.out.println(status);
		
		/*status = sm1.delete("G0011111");
		System.out.println(status);*/
		
		/*numOfStudents = sm1.findTotalStudents();
		System.out.println(numOfStudents);*/
		
		
	}
	
}
