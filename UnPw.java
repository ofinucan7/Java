import java.util.Scanner;
import java.util.Arrays;

public class UnPw {
    public static void main(String args[]) {
     Scanner keyboard = new Scanner(System.in);
	 System.out.println("Please enter your username.");
	 
	 String[] Un = {"Jerry", "Owen", "Amanda", "Nicky", "Adam", "Sid", "Ethan", "Greyson"}; //list of valid user names
	 String[] Pw = {"Jerry1", "Owen1", "Amanda1", "Nicky1", "Adam1", "Sid1", "Ethan1", "Greyson1"}; //list of password in same order as usernames
	 String enterUn = keyboard.next(); //gets user input for username
	 int UnId = 0; //sets the first user id index number
	 int x = 1; //sets number x that controls a while loop
	 int q = 1; //used to control a while loop with the password
	 int UnNumb = 0; //index number of the username entered
	 int y = 0; //sets number y that controls a while loop
	 boolean testUn = Arrays.asList(Un).contains(enterUn); //boolean used to control if statement to advance to entering password
	 boolean checkUnId = enterUn.equals(Un[UnId]); //boolean used to control if statement to find username id index number
	 boolean checkPwId; //used to help with the password to figure out if what is entered is correct or not
	 
	 while (q == 1) {
		 while (x != 0) {
			 if (testUn = true){
				 //advance to password
				  System.out.println("Welcome " + enterUn + ". Please enter your password.");
				  x = 0;
				 //determining the index number of the username
				 while (y != 1) {
					 if (checkUnId) { //if the UN index number equals the enter UN, sets the UN ID number to that
						 UnNumb = UnId;
						 y = 1;
					 } else
					UnId = UnId + 1; //adds 1 to y to change the index being checked
					checkUnId = enterUn.equals(Un[UnId]);
				 }
			 } else {
				 //password is incorrect and prompts the user to enter a user name
				 System.out.println("The username entered is incorrect, please try again.");
				 enterUn = keyboard.next();
				 testUn = Arrays.asList(Un).contains(enterUn);
			 }
		 }
		String enterPw = keyboard.next(); //get keyboard input for password
		while (q != 0) {
			checkPwId = enterPw.equals(Pw[UnNumb]);
			if (checkPwId) {
				//if password is correct, output that and end while loop
				System.out.println("Password Correct! Welcome " + enterUn + ".");
				q = 0;
			} else {
				//password enter is incorrect, prompts the user to reenter another password
				System.out.println("The password you entered was incorrect. Please try again");
				enterPw = keyboard.next();
				checkPwId = enterPw.equals(Pw[UnNumb]);
			}
		} 
	 }
    }
}