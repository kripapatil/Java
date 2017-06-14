package pack1;

public class ReverseArray {

	public static void main(String[]args){
		int arr1[]={1,2,3,4,5,6};
		int n=arr1.length;
		int rev[] = new int[n];
		int j=n-1;
		for (int i=0;i<n;i++){
			rev[i]=arr1[j];
			j--;
		}
		for (int i=0;i<n;i++){
			System.out.println(rev[i]);
		}
		
	}
}
