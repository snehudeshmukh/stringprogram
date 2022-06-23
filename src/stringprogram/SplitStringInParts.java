package stringprogram;

public class SplitStringInParts {
public static void main(String[] args) {
	int splitNumber=3;
	String str="abcdefghijkl";
	splitString(str,splitNumber);
	
}
	
	public static void splitString(String str1,int n) {
		int len=str1.length();
		int part_size;
		if(len%n!=0) {
			System.out.println("The size of String is not divisible by:"+n);
			return;
		}
		else {
			part_size=len/n;
			for(int i=0;i<len;i++) {
				if(i%part_size==0)
					System.out.println();
				System.out.print(str1.charAt(i));
			}
				
		}
}
}
