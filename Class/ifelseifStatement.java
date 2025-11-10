import java.util.Scanner;


public class ifElseifStatement{
	public static void main(String[] args){
		
		// Scanner object has been created
		Scanner input = new Scanner(System.in);
		
		//Variable declaration
		int mark;
		String name;
		
		//prompt user for input
		System.out.print("Enter your Name: ");
		fullName = input.nextLine();
		
		System.out.print("Enter your mark: ");
		mark = input.nextLine();
		
		
		if(mark >= 80){
			System.out.printf("fullName: %s Mark: %d your grade is A",fullName,mark);
		}
		else if(mark >= 70){
			System.out.printf("fullName: %s Mark: %d your grade is B",fullName,mark);
		}
		else if(mark >= 65){
			System.out.printf("fullName: %s Mark: %d your grade is C",fullName,mark);
		}
		else if(mark >=50){
			System.out.printf("fullName: %s Mark: %d your grade is D",fullName,mark);
		}
		else if(mark >= 40){
			System.out.printf("fullName: %s Mark: %d your grade is E",fullName,mark);
		}
		else{
			System.out.printf("fullName: %s Mark: %d your grade is F",fullName,mark);
		}
	}
}
