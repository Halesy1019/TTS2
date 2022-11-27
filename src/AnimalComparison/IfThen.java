package AnimalComparison;
import java.util.Scanner;

public class IfThen {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("What is your favorite animal?");
		String response = input.nextLine();
	if(response.contains("fox") ) {
		System.out.println("yelpbark");
	}
	else if (response.contains("turtle")) {
		System.out.println("snap, snap");
	}
	}
		// TODO Auto-generated method stub

	}



