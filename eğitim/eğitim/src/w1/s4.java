package w1;

import java.util.Scanner;

public class s4 {
	
	public static void main(String[]args) {
		
		Scanner kw = new Scanner(System.in);
		System.out.println("x say�s�n� girin");
		double sayiX = kw.nextInt();
		System.out.println("y say�s�n� girin");
		int sayiY = kw.nextInt();
		double sonuc = ((3*sayiX)+7)/(sayiY);
		System.out.println("Denkleme g�re sonu�:" + sonuc );
		
		
	}

}
