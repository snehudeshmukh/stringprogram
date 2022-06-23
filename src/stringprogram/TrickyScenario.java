package stringprogram;

public class TrickyScenario {
public static void main(String[] args) {
	String s[]= {"a","AA","aaa"};
	System.out.println(s.length);
	//System.out.println(s.length());// array not used length() method
	//System.out.println(s[0].length);//string not used array method
	System.out.println(s[0].length());
}
}
