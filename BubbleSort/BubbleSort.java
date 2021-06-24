package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 3, 2, 5, 6,-2,1, 3, 14, 12};
		for(int i=0;i<list.length-1;i++) {
			for(int j=list.length-1;j>i;j--) {
				if(list[j]<list[j-1]) {
					list[j]=list[j]^list[j-1];
					list[j-1]=list[j]^list[j-1];
					list[j]=list[j]^list[j-1];
				}
			}
		}
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}

}
