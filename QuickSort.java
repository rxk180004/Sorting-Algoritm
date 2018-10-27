package Sorting;

public class QuickSort {
	public int partition(int[]arr ,int low ,int high) {
		int i=low;
		int pivot=arr[high];
		
		for (int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				
			}
		}
			int temp=arr[i];
			arr[i]=arr[high];
			arr[high]=temp;
			
		return i;
	}
	
	public void sort(int[] arr,int low,int high){
		if(low<high) {
			int pi=partition(arr,low,high);
			System.out.println(pi+" ");
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
	
	public void display(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] arr= {4,6,88,22};
		int n=arr.length;
		
		QuickSort qs=new QuickSort();
		qs.sort(arr,0,n-1);
		
		qs.display(arr);

	}

}
