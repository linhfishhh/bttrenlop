package insertSort;

public class insertSort {
	static int[] lst= {1,2,4,6,7,5,9};
	public static void insertionSort(int[] array){
		int pos,index;
		for(int i=1;i<array.length;i++) {
			index=array[i];
			pos=i;
			while(pos>=0 && index < array[pos-1]) {
				array[pos]=array[pos-1];
				pos--;
			}
			array[pos]=index;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertionSort(lst);
		for (int i=0;i<lst.length;i++) {
			System.out.print(lst[i]+" ");
		}
	}

}
