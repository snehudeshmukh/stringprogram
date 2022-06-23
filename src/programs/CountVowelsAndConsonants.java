package programs;

public class CountVowelsAndConsonants {
public static void main(String[] args) {
	int vCount=0;
	int cCount=0;
	String s1="aabcdgijkiiopn";
	//char[] s2=s1.toCharArray();
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') 
		{
			vCount++;
		}
	
	else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
		cCount++;
	}
	System.out.println(vCount);
	System.out.println(cCount);
}
}
