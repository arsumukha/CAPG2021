package day7.practicetest;

public class Exercise5 {
	public static String repeatEnd(String s,int n) {
		String x=s.substring(s.length()-n);
		s="";
		while(n>0) {
			s+=x;
			n--;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatEnd("hello",3));
	}

}
