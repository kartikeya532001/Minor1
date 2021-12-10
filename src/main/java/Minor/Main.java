package Minor;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Fristpage obj = new Fristpage();
		obj.fristpage();
		RegisterAndLogin obj1 = new RegisterAndLogin();
		System.out.println("Press 1 for login");
		System.out.println("Press 2 for register");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			obj1.login();
			break;
		}
		case 2: {
			obj1.Register();
			break;
		}
		default: {
			System.out.println("Invalid input");
		}
		}
	}

}
