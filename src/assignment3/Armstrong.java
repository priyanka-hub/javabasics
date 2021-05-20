package assignment3;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150, number, temp, total = 0;

        number = n;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
	}

}
