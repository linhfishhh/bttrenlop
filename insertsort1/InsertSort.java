package insertsort1;

public class InsertSort {
	public static void insertSort(int[] arr) {
		int index;
		for(int i=1;i<arr.length;i++) {
			index=arr[i];
			while(i>0 && index<arr[i-1]) {
				arr[i]=arr[i-1];
				i--;
			}
			arr[i]=index;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,2};
		InsertSort.insertSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
