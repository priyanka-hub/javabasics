package assignment;

public class Basics {
public static void main(String[] args) {
	
	int a=10,b=20;
	int c=a+b;            //addition method
	
	System.out.println("The sum is=" +c);
	
}
	Basics test = new Basics();//creating object

	}
class Objects extends Basics{
	
Basics obj=new Objects();
public void print(int sum) { 
    System.out.println("Signature is: print(int)");
}	
}
