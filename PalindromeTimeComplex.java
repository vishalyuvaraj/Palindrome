package Palindrome;

import java.util.Scanner;

public class PalindromeTimeComplex {
	static boolean isP(String s) {
		int l = s.length();
		int l2 = l/2;
		int j = l - 1;
		for(int i=0; i<l2; i++) {
			if(s.charAt(i) != s.charAt(j)) {
				System.out.println(s + " is not a Palindrome");
			   return false;
			}
			j--;
		}
		System.out.println(s + " is a Palindrome");
		return true;
	}

	public static void main(String[] args) {
		while(true) {
			//String original,reverse="";
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the String: " + "\n");
			String original = in.nextLine();
			String s = original;
			System.out.println(isP(s));
		}

	}
	
}




