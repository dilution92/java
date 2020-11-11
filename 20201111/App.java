package ½Ç½À;

public class App {

	public static void main(String[] args) {
	LenthOfTwoString lambda = (s1,s2) -> s1 + s2;
	final String s = lambda.getString("Hello", "Lambda!");
	System.out.println(s);
	
	}

}
