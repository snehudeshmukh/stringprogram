package stringprogram;

import java.util.Arrays;

public class SmallBigPalindrome {
public static void main(String[] args) {
	String s="abba madam is aa racecar";
	String s2[]=s.split(" ");
	String s5[]=new String[s2.length];
	System.out.println(Arrays.toString(s2));
	StringBuffer s3=null;
	String s6="";
	for(int i=0;i<s2.length;i++) {
		s3=new StringBuffer(s2[i]);
		s3.reverse();
		String a=new String(s3);
		s5[i]=a;
	}
		System.out.println(Arrays.toString(s5));
		
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	String s4=new String(s3);
	//String s5[]=s4.split(" ");
	for(int i=0;i<s2.length;i++) {
		for(int j=0;j<s5.length;j++) {
			if(s2[i].equals(s5[j])) 
				System.out.println("Palindrome Words:"+s2[i]);
			s6=s2[i];
		}
		
	}
	System.out.println(s6);
	
}
}
