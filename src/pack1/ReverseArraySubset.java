package pack1;

public class ReverseArraySubset {

	public static void main(String[]args){
		int arr1[]={1,2,3,4,5,6,7,8,9};
		int subset=3;
		int n=arr1.length;
		
		for (int i=0; i<n;i+=subset){
			int left =i;
			int right = Math.min(i+subset-1,n-1);
			while (left<right){
				int temp = arr1[left];
				arr1[left]=arr1[right];
				arr1[right]=temp;
				left++;
				right--;
			}
			
		}
		
		
		for (int i=0;i<n;i++){
			System.out.println(arr1[i]);
		}
		
	}
}
