package programs;

public class Palindrome {
public static void main(String[] args) {
	String s1="abca";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		 s2=s2+s1.charAt(i);
		
	}
	System.out.println(s2);
	if(s1.equals(s2))
		System.out.println("Number is Palindrome");
	else
		System.out.println("Number is not palindrome");
}
}
