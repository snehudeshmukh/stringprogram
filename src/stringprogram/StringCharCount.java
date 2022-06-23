package stringprogram;

public class StringCharCount {
public static void main(String[] args) {
	String s1="The Best Developer java";
	int count=0;
	s1=s1.toLowerCase();
	int count1=0;
	for(int i=0;i<s1.length();i++) {
//		if(s1.charAt(i)!=' ') 
//			count++;
	
		
	//}
	//System.out.println("Number of Charavter in String:"+count);
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
		count++;
		
			
	}
	else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
		count1++;
	}
	System.out.println("Number of vowels:"+count);
	System.out.println("Number of consonanets:"+count1);
	}
}

