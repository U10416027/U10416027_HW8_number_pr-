import java.math.BigDecimal;

public class NumAccuracy {
  	private BigDecimal num1;
	private BigDecimal num2;
	
	public NumAccuracy(double firstNum, double secondNum){
		num1 = BigDecimal.valueOf(firstNum);  
		num2 = BigDecimal.valueOf(secondNum);
	}
	
	public  static  double  add(double firstNum, double secondNum){  
		BigDecimal b1 = BigDecimal.valueOf(firstNum);  
		BigDecimal b2 = BigDecimal.valueOf(secondNum); 
	    	System.out.println("the answer is ;  " + b1.add(b2).doubleValue());
        	return  b1.add(b2).doubleValue();
    	}
    	
    	public  static  double  sub(double firstNum, double secondNum){  
		BigDecimal b1 = BigDecimal.valueOf(firstNum);  
	    	BigDecimal b2 = BigDecimal.valueOf(secondNum); 
	    	System.out.println("the answer is ;  " + b1.subtract(b2).doubleValue());
        	return  b1.subtract(b2).doubleValue();
    	}

	public  static  double  mul(double firstNum, double secondNum){  
		BigDecimal b1 = BigDecimal.valueOf(firstNum);  
	    	BigDecimal b2 = BigDecimal.valueOf(secondNum); 
	    	System.out.println("the answer is ;  " + b1.multiply(b2).doubleValue());
        	return  b1.multiply(b2).doubleValue();
    	}

	public  static  double  div(double firstNum, double secondNum, int scale){  
		BigDecimal b1 = BigDecimal.valueOf(firstNum);  
	    	BigDecimal b2 = BigDecimal.valueOf(secondNum); 
	    	System.out.println("the answer is ;  " + b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue());
        	return  b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
