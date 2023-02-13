package day4;

public class PalindromeMain {
	public static  boolean isPalindrome(int inputNumber) {
        int  reversedNumber = 0;
        int remainderNumber;
        int originalNumber = inputNumber;
        
        //Initialize the inputNumber and store it in the new variable originalNumber.
         
          
          while(inputNumber>0) {
        	  remainderNumber = inputNumber%10;
        	  reversedNumber = (reversedNumber*10) + remainderNumber;
        	  inputNumber =inputNumber/10;
        	  
          }
          
          if(originalNumber ==reversedNumber) {
        	  return true;
        	  }else {
        	  return false;
        	  }

	}          
          

	public static void main(String[] args)  {

		System.out.println(isPalindrome(100));
			
	}

}      


	    
