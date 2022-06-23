package programs;

public class CountTotalNumOfChar {
public static void main(String[] args) {
	String str="The best of both worlds";
	//System.out.println(str.length());
	int count=0;
	char s1[]=str.toCharArray();
	for(int i=0;i<s1.length;i++) {
		if(s1[i]!=' ')
			count++;
	}
	System.out.println("Number Of Character is:"+count);
}
}
