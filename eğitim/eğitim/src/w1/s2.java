package w1;

import java.util.Scanner;

public class s2 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Birinci sayýyý girin: ");
		int sayi1 = klavye.nextInt();
		System.out.println("Ýkinci sayýyý girin: ");
		int sayi2 = klavye.nextInt();
		System.out.println("Girdiðiniz sayýlarýn toplamý:" + (sayi1+sayi2) + "\nGirdiðiniz sayýlarýn farký :" + (sayi1-sayi2) + "\nGirdiðiniz sayýlarýn çarpýmý:" + (sayi1*sayi2));
		
	}

}
