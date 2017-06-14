package pack1;

public class SortArray {

	public static void main (String[]args){
		int arr[] = {4,1,7,5,8,9,0,1,2,10,11};
		int n = arr.length;
		//bubble sort
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
}
}