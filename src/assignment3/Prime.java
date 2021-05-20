package assignment3;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 18,temp;
		 boolean isPrime=true;
		 
		 for(int i=2;i<=n/2;i++)
		 {
		    temp=n%i;
		    if(temp==0)
		    {
		       isPrime=false;
		       break;
		    }
		 }
		      
		 if(isPrime)
			   System.out.println(n+ " is a Prime Number");
			else
			   System.out.println(n + " is not a Prime Number");
		    
		      
	}

}
