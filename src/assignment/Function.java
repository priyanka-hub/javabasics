package assignment;

public class Function {
	
	static void name()
    {
        System.out.println("Priyanka!");
  
        // Calling the main() method
        // Note that no parameter is passed
       
    }
  
    // main() method
    public static void main(String[] args)
    {
        System.out.println("name");
  
        // Calling the mainCalller() method
        // so that main() method is called externally
       name();
    }}