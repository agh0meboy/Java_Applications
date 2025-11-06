import java.util.Scanner;


public class SentinelControlLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		int counter = 0;
		
		System.out.printIn("Enter -1 to terminate the loop");
		while(true){
			System.out.print("Enter Number: ");
			num = input.nestInt();
			
			
			if(num = -1){
				break;
			}
			sum += num;
			counter++;
		}
		System.out.printf("THe total of the %d number(0) is %d%n"counter,sum);
	}
}


