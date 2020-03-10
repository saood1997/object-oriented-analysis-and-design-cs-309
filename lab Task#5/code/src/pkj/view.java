package pkj;
import java.util.Scanner;
public class view {
	public String getdata() {
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string"); 
 		s = sc.nextLine();
 		return s;
		//System.out.println("You entered String "+s);
	}
	public void show(boolean flag) {
		if(flag==false) {
			System.out.println("Invalid Email");
		}
		else {
			System.out.println("valid Email");
		}
	}
}