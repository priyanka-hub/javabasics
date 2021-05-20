package assignment3;
import java.util.Scanner;
public class Gender {
	static String sex;
    static String M = "male";
    static String F= "Female";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	        // TODO code application logic here
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your sex here:");
	        sex = in.nextLine();

	        if (sex.equalsIgnoreCase(M) || sex.equalsIgnoreCase("m")) {
	            System.out.println("male");
	        } else if (sex.equalsIgnoreCase(F) || sex.equalsIgnoreCase("f")) {
	            System.out.println("female");
	        }

}}
