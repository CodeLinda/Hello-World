# Hello-World. These are some basics in Java
package javamasterclass.com.company;

public class Main {

    public static void main(String[] args) {
        // float and double
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("My int value= " + myIntValue);
        System.out.println("My float value= " + myFloatValue);
        System.out.println("My double value= " + myDoubleValue);

        //Converting 200 pounds into kilograms
        double pound = 200d;
        double kilogram = pound * 0.45359237d;
        System.out.println("Two pounds equals to " + kilogram);

        //char and boolean primitive datatypes
        char myChar = 'D';
        char myUniCode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniCode);

        //String data type
        String myString = "This is my string";
        myString = myString + ". I like it";
        System.out.println(myString);

        //operator
        int result = 2 + 1;
        System.out.println("Result: " + result);
        result++; //result=result+1 next is result+=2
        System.out.println("Result is " + result);

        // If then statement
        boolean notGaurav = false;
        if (notGaurav == false) { // use code block
            System.out.println("This is not Gaurav");
            System.out.println("This is Gaurav");
        }
        int topscore = 100;
        if (topscore == 100) {
            System.out.println("You got the highest score!");
        }

        //operator precedence
        int justValue=105;
        if ((justValue>100) && (justValue>103)){ //and operator
            System.out.println(justValue);
        }
        if ((justValue>100) || (justValue>103)) { //or operator
            System.out.println(justValue);
        }

    }
}
