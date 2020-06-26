package sef.module8.sample;
// Needs to be completed
public class CustomExceptionSample {

	//static setAge(int age) which throws CustomException  
	public static void setAge(int age) throws CustomException{
		//1 - Check if age<0. if yes, then throw CustomException
		assert age = 10;
		if(age<0)
		{
			//Creating and throwing an instance of CustomException
			//this ensures that CustomException is thrown
			throw new CustomException();
		}
	}
	
	public static void main(String arg[]){
			//Since CustomException is a checked exception, it's mandatory to call setAge method
			//inside a try catch block. Else the code would not compile.
			//2 - call setAge method with -1 as its parameter and surround this with a try catch block
		try {
			setAge(-10);
		} catch (CustomException e) {
			System.out.println("Age cannot be less then 0");
			System.out.println(getMessage());
		}	
		
	}
}
