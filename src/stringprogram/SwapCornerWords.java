package stringprogram;

import java.util.Arrays;

public class SwapCornerWords {
public static void main(String[] args) {
	String s1="My new world is in IT";
	String[]s2=s1.split(" ");
String temp=null;
if(s2!=null) {
	temp=s2[0];
	s2[0]=s2[s2.length-1];
	s2[s2.length-1]=temp;
	
}
StringBuffer s3=null;
System.out.println(Arrays.toString(s2));
	for(int i=1;i<s2.length-1;i++) {
			s3=new StringBuffer(s2[i]);
			s3.reverse();
			String s4=new String(s3);
			s2[i]=s4;
	
}
	String s5="";
	
//System.out.println(s5);
	for(int i=0;i<s2.length;i++) {
		 s5+=s2[i]+" ";
	}
	System.out.println(s5);
}
}
