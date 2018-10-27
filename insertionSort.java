package Sorting;

public class insertionSort {
	public static int[] insertSort(int[] iparr) {
		for (int i=1;i<iparr.length;i++) {
			for (int j=i;j>0;j--) {
				if(iparr[j]<iparr[j-1]) {
					int temp=iparr[j];
					iparr[j]=iparr[j-1];
					iparr[j-1]=temp;
				}
			}
		}
		return iparr;
	}
	public static void main(String[] args) {
		int arr[]= {5,3,1,6,2};
		System.out.println("elements before sortig is");
		System.out.println("elements  is"+arr.length);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		
		int arr1[]= insertSort(arr);
		System.out.println("elements after sortig is");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}


	}

}
