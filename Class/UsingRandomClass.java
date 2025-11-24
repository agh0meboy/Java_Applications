import java.util.Random;


public class UsingRandomClass{
	public static void main(String[] args){
		Random random = new Random();
		
		int number = random.nextInt();
		System.out.printf("The number generated %d%n",Math.abs(number));
		
		int myNumber = random.nextInt(20 + 1);
		System.out.printf("My generated Number is %d%n", myNumber);
		
		double myDoubleNumber = random.nextDouble();
		System.out.printf("My generated float point number is %d%n", myDoubleNumber);
		
		boolean isFun = random.nextBoolean();
		System.out.printf("IS Java Fun %b%n",isFun);
		
		
		
		
	}
}
