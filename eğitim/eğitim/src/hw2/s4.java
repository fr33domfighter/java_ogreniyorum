package hw2;

import java.util.Scanner;

public class s4 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Ýki kelimelik bir cümle girin: ");
		String cumle = klavye.nextLine();
		int bosluk = cumle.indexOf(" ");
		System.out.println(bosluk);
		System.out.println(cumle.substring(0,bosluk));
		System.out.println(cumle.substring(bosluk+1));
		
		
	}

}
