package baseball_version2;

public class BaseballStats {
	
	 public static void menu(){ Scanner sa = new Scanner(System.in); String
	 userInput = null; int selection = 0; System.out.
	 println("What would you like to do? Please select from the options below:"
	 ); System.out.println("1 - Enter new batter(s)");
	 System.out.println("2 - Enter batting results");
	 System.out.println("3 - Diplay batting average");
	 System.out.println("4 - Display slugging percentage");
	 System.out.println("5 - Quit"); userInput = sa.nextLine();
	 
	 if(isValidSelection(userInput)){ selection = Integer.parseInt(userInput);
	 makeSelection(selection); }else{ menu(); } }
	 

	
	 public static boolean isValidSelection(String input){ int userSelection =
	 0; boolean isValid = false;
	  
	 try{ userSelection = Integer.parseInt(input); if(userSelection > 0 &&
	 userSelection < 6){ isValid = true; }else {
	 System.out.println("Please enter a valid number 1-5"); }
	 }catch(NumberFormatException e){
	 System.out.println("Selection must be a number 1-5"); } return isValid; }
	  
	 public static void makeSelection(int optionSelected){ switch
	 (optionSelected) { case 1: getNumBatters(); break;
	  
	 default: System.out.println("Goodbye"); System.exit(0); break; } }
	  
	 public static void printMenu(){ System.out.
	 println("What would you like to do? Please select from the options below:"
	 ); System.out.println("1 - Enter new batter(s)");
	 System.out.println("2 - Enter batting results");
	 System.out.println("3 - Diplay batting average");
	 System.out.println("4 - Display slugging percentage");
	 System.out.println("5 - Quit"); }
	 
}
