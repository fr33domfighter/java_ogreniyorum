package hw2;

import java.util.Scanner;

public class s5 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Birinci stringi girin:");
		String str1 = klavye.nextLine();
		System.out.println("Ýkinci stringi girin:");
		String str2 = klavye.nextLine();
		System.out.println("Birinci stringin ilki " + str1.charAt(0) + " Birinci stringin sonu " + str1.charAt(str1.length()-1));
		System.out.println("Ýkinci stringin ilki " + str2.charAt(0) + " Ýkinci stringin sonu" + str2.charAt(str2.length()-1));
	
	}

}
