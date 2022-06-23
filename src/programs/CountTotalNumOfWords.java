package programs;

import java.util.Arrays;

public class CountTotalNumOfWords {
public static void main(String[] args) {
	String s1="Beauty lies in the eyes of beholder";
	String[] str=s1.split(" ");
	System.out.println(Arrays.toString(str));
	System.out.println("Total Number of Words:"+str.length);
}
}
