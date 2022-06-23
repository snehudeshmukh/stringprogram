package stringprogram;

public class Scenario {
public static void main(String[] args) {
	String s1= "1234ram56";
	String s2=s1.replaceAll("[1-9]","");
	String s3=s1.replaceAll(s2, (new StringBuffer(s2).reverse().toString()));
	System.out.println(s3);
}
}
