package begining;
// First Java Program as per the culture 
public class Main{
	public static void main(String[] args) {
		String message="Hello World!. Its me \"Gaurav\"";
		System.out.println(message.length());
		System.out.println(message.toLowerCase());
		
		//sum of 2 3 and 4
		int x=35;
		double y=x;
		System.out.println(y);
		// Math function
		Math.max(25, 30);
		System.out.println(Math.max(25,30));
		
		//if and else statement
		int mynum=25;
		int mynum1=55;
		if(mynum>mynum1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not valid");
		}
		//WAP to list 3 first months and print first
		int month =1;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
		}
		
		for(int i=0; i<11; i++) { //printing from 0 to 10 simultaneously
			if (i==4){
				continue;
			}
			System.out.println(i);
		
		}
		String[] name= {"Ram","Hari","Shyam"}; //Array elements and accessing the elements of array
		for (String i:name) {
			System.out.println(i);
		}
		
		name[2]="Bob";
		System.out.println(name[2]);
		System.out.println(name.length); //helps us to know the length of Array
		}
	static void method(String name, int x) { //multiple parameters
		System.out.println(name);
		System.out.println(x);
	}
	public static void main1(String[] args) {
		method("Gaurav", 11);
		
		
	}
}


		
		 	
	

	