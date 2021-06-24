package qlhd;
import java.util.Scanner;
import java.util.ArrayList;
public class Manager {
	ArrayList<Person> arr=new ArrayList<Person>();
	Scanner sc=new Scanner(System.in);
	public Person CreaKH() {
		System.out.println("nhap ma kh");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("nhap ten");
		String name=sc.nextLine();
		System.out.println("nhap ngay");
		int date=Integer.parseInt(sc.nextLine());
		System.out.println("nhap kwh");
		int kwh=Integer.parseInt(sc.nextLine());
		System.out.println("don gia");
		int dongia=Integer.parseInt(sc.nextLine());
		System.out.println("quoc tich: 1-vietnam, 2-quocte");
		String qt=sc.nextLine();
		String vietnam="vn";
		if(qt.equals(vietnam)) {
			System.out.println("doi tuong");
			String doituong=sc.nextLine();
			System.out.print("dinhmuc");
			int dinhmuc=Integer.parseInt(sc.nextLine());
			return (Person) new khvn(id,name,date,kwh,dongia,doituong,dinhmuc);
		}else return (Person) new khqt(id,name,date,kwh,dongia,"quocte");
	}
	public void add() {
		Person p=CreaKH();
		arr.add(p);
	}
	public void show() {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
	public void repair() {
		System.out.print("nhap id ban muon sua");
		int a=Integer.parseInt(sc.nextLine());
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getId()==a) {
				arr.set(i, CreaKH());
			}
		}
	}
	public void Remove() {
		System.out.println("nhap id ban muon xoa");
		int b=Integer.parseInt(sc.nextLine());
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getId()==b) {
				arr.remove(i);
			}
		}
	}
}
