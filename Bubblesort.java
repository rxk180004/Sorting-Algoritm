package Sorting;
//Bubble sort for sorting of Integers
public class Bubblesort {
	
	public static int[] sort(int[] arr){
		int temp=0;
		for (int j=0;j<arr.length-1;j++) {
			for(int i=2;i<arr.length-j-1;i++) {
			for(int i=0;i<arr.length-j-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] a= {5,8,0,4,7,3,9,2};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		sort(a);
		System.out.println();
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
	}

}
