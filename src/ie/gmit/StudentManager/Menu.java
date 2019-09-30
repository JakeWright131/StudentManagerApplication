package ie.gmit.StudentManager;

import java.util.Scanner; // Need for Scanner

public class Menu {

	//create a start method which displays a menu of options to the screen

	//Instance Variables
	private Scanner userInput;
	private StudentManager sm1;
	private boolean keepRunning;
	
	
	public Menu() {
		//Create new scanner objust to capture input from the user
		userInput = new Scanner(System.in);
		sm1 = new StudentManager(); //Create a new student manager
		keepRunning = true; //Initialise loop checker
	}
	
	public void display() {
		while(keepRunning) {
			//Display menu to user
			showOptions();
		}
	}
	
	private void showOptions() {
		System.out.println("##########################");
		System.out.println("# Student Manager v 0.9 #");
		System.out.println("##########################");
		System.out.println("(1) Load Student DB");
		System.out.println("(2) Add a Student");
		System.out.println("(3) Delete a Student.");
		
	}
	
	
	public void start() {
		//System.out.println("This is a menu of options");
	}
	
}
