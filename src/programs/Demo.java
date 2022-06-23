package programs;

public class Demo {
public static void main(String[] args) {
	String s1= new String("ABC");
	//String s2=s1;
	String s3=s1.concat("ABC");
	String s4=s3;
	System.out.println(s1==s3);
	System.out.println(s3==s4);
}
}
