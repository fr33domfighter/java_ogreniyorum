package w1;

import java.util.Scanner;

public class s1 {
	
	public static void main(String[]args){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Doðum yýlýnýzý giriniz:");
		int dogumYili = klavye.nextInt();
		System.out.println("Yaþýnýz: " + (2022 - dogumYili));
		
		
	}

}
