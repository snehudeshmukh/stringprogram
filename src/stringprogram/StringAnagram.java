package stringprogram;

import java.util.Arrays;

public class StringAnagram {
public static void main(String[] args) {
	String s1="acbd";
	String s2="abcd";
	boolean flag=false;
	char[] s3=s1.toCharArray();
	System.out.println(s3);
	char[]s4=s2.toCharArray();
	Arrays.sort(s3);
	Arrays.sort(s4);
	
	if(Arrays.equals(s3,s4)==true) {
		System.out.println("Given numbers are angram");
	}
	else {
		System.out.println("not anagram");
	}
	
}

	
}

