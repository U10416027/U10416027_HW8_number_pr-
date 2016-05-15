import java.util.*;

public class TestNumAccuracy {
	public static void main(String[] args) {
	  	double firstNum;
		double secondNum;
		int divScale;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter 2 numbers you want to calculate");
		firstNum = input.nextDouble();
		secondNum = input.nextDouble();
		
		System.out.println("set the scale when you want to devide those numbers");
		divScale = input.nextInt();
	
		while(divScale < 0){
			System.out.println("the scale can't less than zero, enter again");
			divScale = input.nextInt();
		}
		
		System.out.println("which way you want to calculate ?");
		System.out.println("1 = ' + '");
		System.out.println("2 = ' - '");
		System.out.println("3 = ' X '");
		System.out.println("4 = ' / '");
		int judge = input.nextInt();
		
		while(judge < 1 || judge > 4){
			System.out.println("it's not in the range, enter again");
			judge = input.nextInt();
		}
	
	
	
	}
}
