package Exception;
import java.util.Random;
import java.util.Scanner;
public class ExceptionJava {
	public Integer[] createRandom() {
		Random rd=new Random();
		Integer[] arr=new Integer[100];
		System.out.println("Danh sach phan tu cua mang");
		for (int i=0;i<100;i++) {
			arr[i]=rd.nextInt(100);
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionJava arrExample= new ExceptionJava();
		Integer[] arr=arrExample.createRandom();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
		int x = sc.nextInt();
		try {
			System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
		} catch (Exception e) {
			System.err.println("Chỉ số vượt quá giới hạn của mảng");
		}
	}
}
