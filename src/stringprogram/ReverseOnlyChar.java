package stringprogram;

public class ReverseOnlyChar {
public static void main(String[] args) {
	String str="123Ram45";
	String s1="";
	for(int i=0;i<str.length();i++) {
		if(Character.isLetter(str.charAt(i)))
				s1=s1+str.charAt(i);
	}
	StringBuffer s2=new StringBuffer(s1);
	s2.reverse();
	str=str.replace("Ram", s2);
	System.out.println(str);
}
}
