package madLib;

import java.util.Scanner;



public class helloWorldEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
//MadLib Age Limit

int ageLimit = 18;

System.out.println("How old are you?");
Scanner input=new Scanner(System.in);
String ageString=input.nextLine();

int age = Integer.parseInt(ageString);


if (age < ageLimit) {
	System.out.print("You are too young! Sorry!\n");
	System.exit(0);
} else {
	//Program continues to normal bc they have passed the age test
}
}
}