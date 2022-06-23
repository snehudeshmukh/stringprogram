package programs;

public class Scenario {
public static void main(String[] args) {
	String s1=new String("ABC");//Object on heap
	//String s2=s1.concat("ABC");//s1=ABCABC on heap s2=ABCABC on scp not change s1 reference
	//String s6=s1;
	String s2= new String();
	s2=s1.concat("ABC");
	String s3=s2.intern();//s3 on scp s3=ABCABC
	String s4="ABCABC";//on scp
	System.out.println(s3==s2);
	System.out.println(s3==s4);
	String s5=s1.intern();
	System.out.println(s5==s1);
	//System.out.println(s6==s1);
	
}
	
}

