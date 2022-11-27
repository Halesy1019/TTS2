package AnimalComparison;

public class ClassExample {
	//main function
	public static void main(String[] args) {
		
		//nameOfFunction(        ); //this is a function call!
		sub(55,87);
		System.out.println(sub(55,87));
		
		add(33,2);
		System.out.println(sub(33,2));//function call is when you define your arguments
		
	}
	
	//add 2 numbers aka function definitions
	public static Integer add(Integer number1, Integer number2) {
		Integer sum = number1 + number2;
		
		
		return( sum);
	}
	public static Integer sub(Integer number1, Integer number2) {
		Integer dif = number1 - number2;
		
		return(dif);
		
	}
	
	
	
}

