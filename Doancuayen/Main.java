package Doancuayen;
import java.io.IOException;
import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//create menu
		while(true) {
		Manage m=new Manage();
		System.out.println("________Ung dung quan ly nguoi by Yen Hip____________");
		System.out.println("1.Add Person ");
		System.out.println("2. Show ");
		System.out.println("3. Endcrypt ");
		System.out.println("4.exit  ");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			m.add();
			break;
		case 2:
			m.Show();
			break;
		case 3:
			RSA r=new RSA();
		default:
			System.out.println("CAM ON CAC BAN DA XEM DEMO");
			System.exit(0);
		}
	}
		
	}
}
