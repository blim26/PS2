package base;

public class MyInteger {
	private static int iValue;
	
	public MyInteger(int iValue) 
	{
		MyInteger.iValue = iValue;
	}
	
	public static int getValue()
	{
		return iValue;
	}
	
	public boolean isEven()
	{	return isEven(iValue);
		}
	
	public boolean isOdd()
	{	return isOdd(iValue);
		}
	
	public boolean isPrime()
	{	return isPrime(iValue);
		}
	
	public static boolean isEven(int value)
	{
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isOdd(int value)
	{
		if (value % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	public static boolean isPrime(int value)
	
	{
		double num = 0;
		int sqrt = (int) Math.sqrt (num) + 1;
	
			for (int i = 2; i < sqrt; i++){
				if (num % i == 0){
					return false;
		}
				else{
					return true;
		}
			}
			return false;	
	}
	
	
	public static boolean isEven(MyInteger num){
		if (getValue() % 2 ==0){
			return true;
		}
		else{
			return false;
		}
	}
	
		
	
	
	public static boolean isOdd(MyInteger num){
		if (getValue() % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger num){
		return MyInteger.isPrime(getValue());
	}
	
	public boolean equals(int value){
		if (value == getValue()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equals(MyInteger num){
		if (iValue == getValue()){
			return true;
		} else{
			return false;
		}
	}
	
	
}
