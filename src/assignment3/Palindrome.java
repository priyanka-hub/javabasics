package assignment3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "ABAc";
	     
		  String strRev = new StringBuffer(str).reverse().toString();
	      if (str.equals(strRev))
	         
	    	  System.out.println("Palindrome!");
	      else
	         System.out.println("Not a palindrome!");
	}

}
