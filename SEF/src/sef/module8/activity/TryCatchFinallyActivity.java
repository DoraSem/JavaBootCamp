package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();
	}

	public void catchMeIfYouCan()
	{
		int [] arr={0,1,2,3,4,5,6,7,8,9};
	
		for(int i=0;i<=10;i++)
		{
			
		}
		
		try {
			System.out.println(arr[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong. Checkout the array length.");
		}  
	
		System.out.println("This should get printed even if there is an exception");
	
	}

}
