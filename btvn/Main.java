package btvn;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manage m=new Manage();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Manager");
			System.out.println("QLNV");
			System.out.println("1:add");
			System.out.println("2:Edit");
			System.out.println("3:Tim luong theo ten");
			System.out.println("4: Tim theo ten");
			System.out.println("5: sap xep theo ten");
			System.out.println("6: Show");
			System.out.println("7: Exit");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				m.add();
				break;
			case 2:
				System.out.println("nhap ten muon sua");
				String a=sc.nextLine();
				m.change(a);
				break;
			case 3:
				System.out.print("Nhap ten ban muon hien thi luong");
				String c=sc.nextLine();
				m.showSalary(c);
				break;
			case 4:
				System.out.print("nhap ten muon tim: ");
				String b=sc.nextLine();
				m.showtheoten(b);
				break;
			case 5:
				break;
			case 6:
				m.show();
				break;
			case 7:
				System.out.println("Bye!");
				System.exit(0);
			}
			
		}
	}
}
