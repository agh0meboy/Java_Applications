import java.util.Scanner;

public class EnhancedForLoop {
 public static void main(String[] args) {
	// Create a single dimensional array of size 10 
   String [] names = new String[10];
   
    // Create a single dimensional array of size 10
   int [] marks = new int[10];   
	 
	 // Create the object of the Scanner class
	 Scanner scan = new Scanner(System.in);
	 
	 for(int i = 0; i < 10; i++) {
	  System.out.print("Enter Students Name: ");
	  names[i] = scan.nextLine();
	 
	 
	  System.out.print("Enter Students Mark: ");
	  marks[i] = scan.nextInt();
	  scan.nextLine();
	 
	  System.out.println("===============");
	 }
	 
	 //Transverse through the array to display the element of the arrays 
	 System.out.println("Element of Names array are");
	 for(String name : names){
		 System.out.printf("%s%n",name);
	 }
	 
	 System.out.println("");
	 System.out.println("Element of Marks array are");
	 for(int mark : marks){
		 
		 System.out.printf("%d%n",mark);
	 }
	 
 }
}
