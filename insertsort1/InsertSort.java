package insertsort1;

public class InsertSort {
	public static void insertSort(int[] arr) {
		int pos,x;
		for(int i=1;i<arr.length;i++) {
			x=arr[i];
			pos=i;
			while(pos>=0 && x<arr[pos-1]) {
				arr[pos]=arr[pos-1];
				pos--;
			}
			arr[pos]=x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6,7,2};
		InsertSort.insertSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
