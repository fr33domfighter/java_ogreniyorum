package w1;

import java.util.Scanner;

public class s1 {
	
	public static void main(String[]args){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Do�um y�l�n�z� giriniz:");
		int dogumYili = klavye.nextInt();
		System.out.println("Ya��n�z: " + (2022 - dogumYili));
		
		
	}

}
