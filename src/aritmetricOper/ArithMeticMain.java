package aritmetricOper;

public class ArithMeticMain {

	public static void main(String[] args) {
		
	//Instantiating a class
	ArithmeticOperations ao= new ArithmeticOperations();
	
	//value of num1 is assigned as 2.5
	ao.num1=2.5;
	
	//Invoking the method
	ao.addNumAnd2(); 
	
	//value of num1 is assigned as 2.5
	ao.num1=2.5;
	
	ao.substrateNumAnd2();
	ao.multiplyNumAnd2();
	ao.num1=2.5;
	ao.divideNumBy2();
	}

}
