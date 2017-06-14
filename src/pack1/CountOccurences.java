package pack1;

public class CountOccurences {
	public static void main(String[]args){
		int arr []= {1,2,2,2,2,1,1,1,2,2,3,3,4,4,5,4,4,3,4,4,5,6,7};
		int n=arr.length;
		int x=3;
		System.out.println("The occurence of "+x+" in the given array is: "+countOcc(arr,n,x));
	}
static int countOcc(int arr[], int n, int x){
		int res = 0;
		for(int i=0;i<n;i++){
			if(x==arr[i])
				res++;
		}
		return res;
		}
}