package selectionsort;

public class SelectionSort {
	
	public static void selectionSort(double[] lst) {
		for (int i=0;i<lst.length;i++){
			double currentMin=lst[i];
			int currenMinIndex=i;
			for(int j=i+1;i<lst.length;j++) {
				if(currentMin>lst[i]) {
					currentMin=lst[j];
					currenMinIndex=j;
				}
			}
			if(currenMinIndex!=i) {
				lst[currenMinIndex]=lst[i];
				lst[i]=currentMin;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] lst= {1, 9, 4.5, 6.6, 5.7, -4.5};
		SelectionSort.selectionSort(lst);
		for(int i=0;i<lst.length;i++) {
			System.out.print(lst[i]+" ");
		}
	}

}
