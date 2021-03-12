package day7.practicetest;

public class Exercise4 {
	public static String mixString(String a,String b) {
		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		String s="";
		int n,i=0;
		if (a.length()<b.length())
			n = a.length();
		else
			n = b.length();
		for(i=0;i<n;i++) {
			s+=a1[i];
			s+=b1[i];
		}
		if(n==a.length()) {
			for(int j=i;i<b.length();i++) {
				s+=b1[i];
			}
		}
		else {
			for(int j=i;i<a.length();i++) {
				s+=a1[i];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mixString("XXXX","there"));
	}

}
