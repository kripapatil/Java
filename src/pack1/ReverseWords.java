package pack1;

public class ReverseWords {

	public static void main(String[] args) {
		String str[] = "This is a sample string".split(" ");
		String finalstr = "";
		int n = str.length;
		for(int i=n-1; i>= 0;i--){
			finalstr = finalstr+str[i]+" ";
		}
		System.out.println(finalstr);
		
	}

}
