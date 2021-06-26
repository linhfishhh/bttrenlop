package Exception2;
import java.util.Scanner;
public class Exce1 {
	public void check(int a,int b,int c) {
		try {
			if(a<=0||b<=0||c<=0) {
				throw new IllegalAccessException();
			}
			if(a+b<c||a+c<b||b+c<a) {
				throw new IllegalAccessException();
			}
		}
		catch(Exception e){
			System.out.println("Nhap sai gia tri");
		}
	}
	public static void main(String[] args) {
		Exce1 e=new Exce1();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap a");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("nhap b");
		int b=Integer.parseInt(sc.nextLine());
		System.out.println("nhap c");
		int c=Integer.parseInt(sc.nextLine());
		e.check(a, b, c);
	}
}
