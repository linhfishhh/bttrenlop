package btvn;
import java.util.Scanner;
import java.util.ArrayList;
public class Manage {
	Scanner sc=new Scanner(System.in);
	ArrayList<Person> arr=new ArrayList<Person>();
	public Person createNV() {
	
		System.out.print("Name: ");
		String Name=sc.nextLine();
		System.out.println("Age: ");
		int Age=Integer.parseInt(sc.nextLine());
		System.out.print("Gender: ");
		String Gender=sc.nextLine();
		System.out.println("SDT: ");
		int Sdt=Integer.parseInt(sc.nextLine());
		System.out.print("Email: ");
		String Email=sc.nextLine();
		System.out.println("Salary: ");
		int Salary=Integer.parseInt(sc.nextLine());
		System.out.println("1.Nhan Vien Dao tao");
		System.out.println("2. Nhan Vien tuyen sinh");
		int chose=Integer.parseInt(sc.nextLine());
		if(chose==1) {
			System.out.println("Loai nv:");
			System.out.println("1.Full time, 2.PartTime");
			int loaiNV=Integer.parseInt(sc.nextLine());
			if(loaiNV==1) {
			return new StaffDaotao(Name,Age, Gender, Sdt, Email, Salary,loaiNV);
			}
			else {
				System.out.println("So gio");
				int h=Integer.parseInt(sc.nextLine());
				return new StaffDaotao(Name,Age, Gender, Sdt, Email, Salary,loaiNV,h);
					}
		}else {
			System.out.print("Doanh so:");
			int number=Integer.parseInt(sc.nextLine());
			return new stafftuyensinh(Name,Age, Gender, Sdt, Email, Salary,number);
		}
	}
	public void add() {
		Person p=createNV();
		arr.add(p);
	}
	public void show() {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
	public void change(String name) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(name)) {
				arr.set(i, createNV());
				break;
			}else {
				System.out.println("ko tim thay!");
				break;
			}
		}
		
	}
	public void showtheoten(String name) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(name)) {
				System.out.println(arr.get(i));
			}else {
				System.out.println("ko tim thay!");
				break;
			}
		}
		
	}
	public void showSalary(String name) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(name)) {
				int a=arr.get(i).DoanhThu();
				System.out.println("Luong cua "+arr.get(i).getName()+" la :"+a);
				break;
			}else {
				System.out.println("ko tim thay!");
				break;
			}
		}
		
	}
}
