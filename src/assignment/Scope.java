package assignment;

 class Demo {
	
	 int a = 10;  
	    
	   // non-static or local variable  
	 static int b = 20;  
	}  
	  
	 public class Scope{
	   public static void main(String[] args) {  
	       Demo obj = new Demo();  
	    // accessing the static variable  
	       System.out.println("Value of local variable is:" +(Demo.b)); 
	       // accessing the non-static variable  
	       System.out.println("Value of global variable is: " + (obj.a));  
	  
	       
		 
	   }  
	}  