package day7.practicetest;

public class Exercise6 {
	public static String repeatFront(String s,int n) {
		String x=s.substring(0,s.length()-n);
		s="";
		while(n>0) {
			x=x.substring(0,x.length()-1);
			s+=x;
			n--;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatFront("chocolate",4));
	}

}
