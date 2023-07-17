package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		String browser="chrome";
		switch(browser.trim().toLowerCase()) {
		case "chrome":System.out.println("Launch chrome");
		            
		case "firefox":
			System.out.println("Launch firefox");
			
		case "safari":
			System.out.println("Launch safari");
			
		default:
			System.out.println("invalid");
		}
		int marks=10;
		switch(marks) {
		case 10:System.out.println("Grade A");
		         break;
		case 20:System.out.println("Grade B");
		        break;
		case 30:System.out.println("Grade C");
		        break;
		 default:
			 System.out.println("Invalid");
		}

	}

}
