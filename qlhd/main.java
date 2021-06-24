package qlhd;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("QLKH");
			System.out.println("1:add");
			System.out.println("2.repair");
			System.out.println("3.remove");
			System.out.println("4.show");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				m.add();
				break;
			case 2:
				m.repair();
				break;
			case 3:
				m.Remove();
				break;
			case 4:
				m.show();
				break;
			}
		}
	}

}
