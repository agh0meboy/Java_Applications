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
		
		switch(mark/10){
			case 0:
			case 1:
			case 2:
			case 3:
			System.out.printf("fullName: %s, Mark: $d - Your grade is F",fullName,mark);
			break;
			case 4
			System.out.printf("fullName: %s, Mark: $d - Your grade is E",fullName,mark);
			break;
			case 5
			System.out.printf("fullName: %s, Mark: $d - Your grade is D",fullName,mark);
			break;
			case 6
			System.out.printf("fullName: %s, Mark: $d - Your grade is C",fullName,mark);
			break;
			case 7
			System.out.printf("fullName: %s, Mark: $d - Your grade is B",fullName,mark);
			break;
			case 8:
			case 9:
			case 10:
			System.out.printf("fullName: %s, Mark: $d - Your grade is A",fullName,mark);
			break;
			
			default:
			System.out.printfin("invalid input");
			