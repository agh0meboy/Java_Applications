import java.util.Scanner;

public class UsingEnums{
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT,
	}
	public static void main(String[] args){
		Scaneer scan = new Scanner(System.In);
		
		System.out.printIn("\nEnter Account Type (SAVINGS, CURRENT OR FIXED_DEPOSIT): ");
		
		
		System.out.print("Please enter account type: ");
		String userChoice = scan.nextLine().toUpperCase();
		
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.printIn("Account Created")
		}
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.printIn("Account Created")
		}
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.printIn("Account Created")
		}
		if(selectedType != null){
			System.out.printIn("Selected Account type -> " + selectedType);
		}
		else{
			System.out.print("Invalid Account Type");
		}
	}
}
