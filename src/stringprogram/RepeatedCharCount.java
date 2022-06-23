package stringprogram;

public class RepeatedCharCount {
public static void main(String[] args) {
	
	String s1=new String("aabcdadefaagha");
	char s2[]=s1.toCharArray();
	for(int i=0;i<s1.length();i++) {
		int count=1;
			for(int j=i+1;j<s1.length()-1;j++) {
				if(s2[i]==s2[j]) {
					count++;
				}
			}
           if(i>0) {
			for(int k=i-1;k>=0;k--) {//reverse logic
				if(s2[i]==s2[k]) {
					count=0;
				}
			}
           }
				if(count>0) {
					System.out.println(s2[i]+" "+count);
				}
}
}
}