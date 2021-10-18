package stream16_operator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	// (T,T) ->T 
	public static void main(String[] args) {
		BinaryOperator<BigDecimal> add = (a,b) -> (a.add(b));
		BinaryOperator<BigDecimal> subtract = (a,b) -> (a.subtract(b));
		BinaryOperator<BigDecimal> multiply = (a,b) -> (a.multiply(b));
		BinaryOperator<BigDecimal> divide = (a,b) -> 
			(a.divide(b,32,RoundingMode.HALF_UP));
			
		//
		System.out.println(
				add.apply(getDecimalValue(3.14),
							   getDecimalValue(0.001592)));	
			
		System.out.println(
				divide.apply(getDecimalValue(3.14),
							   getDecimalValue(0.001592)));		
			
	}
	public static BigDecimal getDecimalValue(double x){
		return new BigDecimal(x);
	} 

}
