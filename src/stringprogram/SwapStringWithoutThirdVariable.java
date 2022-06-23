package stringprogram;

public class SwapStringWithoutThirdVariable {
public static void main(String[] args) {
	String a="Hello";
	String b="World";
	a=a+b;//append both string
	b=a.substring(0,a.length()-b.length());//use substring start and end index
	a=a.substring(b.length());//starts with substring b length
	System.out.println("After Swap Strings:"+a+ "     "+b);
	
}
}
