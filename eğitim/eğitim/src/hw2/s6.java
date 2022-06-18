package hw2;

import java.util.Scanner;

public class s6 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("iki karakterli bir ifade girin:");
		String ikili_1 = klavye.next();
		System.out.println("Ýki karakterli bir ifade daha girin: ");
		String ikili_2 = klavye.next();
		System.out.println("Þifre öneriniz: " + ikili_1.charAt(0)+ikili_2.charAt(0)+ikili_1.charAt(1)+ikili_2.charAt(1));
		
		
	}
	

}
