
import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("enter number and I will give you the square root");
		double user = keyboard.nextDouble();
		double square = Math.sqrt(user);
		System.out.println(square);
	}

}
