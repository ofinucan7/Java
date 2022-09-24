import java.util.Scanner;
public class GCF {
    public static void main(String args[]) {
      //establishing variables and input
	  int a,b,div, x;
      Scanner keyboard = new Scanner(System.in);
      
	  
	  System.out.print("Input 2 numbers on the same line to determine their Greatest Common Denominator");
	  
	  
	  a = keyboard.nextInt(); //getting value for 1st number
	  b = keyboard.nextInt(); //getting value for 2nd number

	  //if the 1st number is bigger than the 2nd, the 2nd number will be used to test GCFs and vice versa
	  if (a <= b) {
		  div = a;
	  } else {
		 div = b;
	  }
      
	  //whenever the modulus isnt zero, subtract 1 and try again until the number is found
      while (true) {
		if(a%div == 0 && b%div == 0) {
			div = div;
			break;
		} else {
			div--;
		}
		  
	  }
	  
	  //printing out the value to user
      System.out.println("The GCD of those numbers is " + div);
    }
}

      