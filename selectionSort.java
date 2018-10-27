package Sorting;


public class selectionSort {
	
	public static int[] selectionSorting(int[] iparr) {
		for (int i=0;i<iparr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<=iparr.length-1;j++) {
				if(iparr[j]<iparr[index]) {
					index=j;
				}
			}
				int smallnumber=iparr[index];
				iparr[index]=iparr[i];
				iparr[i]=smallnumber;
		}
		return iparr;
	}
	
	public static void selectionsor_recut(int [] arr,int start_index,int end_index) {
		if(start_index>=end_index) {
			return;
		}
		int min_index=start_index;
		int temp;
		for(int j=start_index+1;j<arr.length;j++) {
			if(arr[min_index]>arr[j]) {
				min_index=j;
			}
		}
		temp=arr[start_index];
		arr[start_index]=arr[min_index];
		arr[min_index]=temp;
		selectionsor_recut(arr, start_index+1, end_index);
	}
	public static void main(String[] args) {
		int arr[]= {12,3,6,5,-1,9,-9};
		//System.out.println("elements before sortig is");
		//System.out.println("elements  is"+arr.length);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		selectionsor_recut(arr,0,arr.length-1);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		
		/*int arr1[]= selectionSorting(arr);
		System.out.println("elements after sortig is");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		*/}
	}
