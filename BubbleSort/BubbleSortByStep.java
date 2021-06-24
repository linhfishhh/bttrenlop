package BubbleSort;
import java.util.Scanner;
public class BubbleSortByStep {
	public static void bubblesortbystep(int[] lst) {
		boolean needNextPass=true;
		for (int k=1;k<lst.length && needNextPass;k++) {
			needNextPass=false;
			for(int i=0;i<lst.length-k;i++) {
				if(lst[i]>lst[i+1]) {
					System.out.println("swap "+lst[i]+" With "+lst[i+1]);
					lst[i]=lst[i]^lst[i+1];
					lst[i+1]=lst[i]^lst[i+1];
					lst[i]=lst[i]^lst[i+1];
					needNextPass=true;
				}
			}
			if(needNextPass==false) {
				System.out.print("Array may be sorted and next pass not needed");
				break;
			}
			System.out.print("List after the '"+k+"' Sort:");
			for(int j=0;j<lst.length;j++) {
				System.out.println(lst[j]);
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter List Size: ");
		int size=sc.nextInt();
		int[] lst=new int[size];
		System.out.println("Enter "+lst.length+" value: ");
		for(int i=0;i<lst.length;i++) {
			lst[i]=sc.nextInt();
		}
		for(int i=0;i<lst.length;i++) {
			System.out.print(lst[i]+" ");
		}
		System.out.println("\nBegin sort processing...");
		bubblesortbystep(lst);
	}

}
