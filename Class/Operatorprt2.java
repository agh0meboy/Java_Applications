public class OperatorPrt2{
	public static void main (String[] args){
		int num1 = 15;
		int num2 = 25;
		int num3 = 17;
		
		// And Logical Operator
		boolean result = (num1 > num2 ) && (num1 > num3);
		System.out.printf("The result is %b", result)
		
		// Or Logical operator
		boolean result2 = (num1 > num2 ) ||+ (num1 > num3);
		System.out.printf("The result is %b", result)
		
		//Not Logical Operator
		boolean result3 = !((num1 > num2 ) && (num1 > num3));
		System.out.printf("The result is %b", result)
		
		// Pre- Increment unary operations
		int num4 = 10 ;
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n" , ++num4);
		
		//Post Increment unary operations
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n" ,num5++);
		
		
		// Pre- Decrement unary operations
		int num4 = 10 ;
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n" , --num4);
		
		//Post Decrement unary operations
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n" ,num5--);
	}
}
`