package w1;

import java.util.Scanner;

public class s2 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Birinci say�y� girin: ");
		int sayi1 = klavye.nextInt();
		System.out.println("�kinci say�y� girin: ");
		int sayi2 = klavye.nextInt();
		System.out.println("Girdi�iniz say�lar�n toplam�:" + (sayi1+sayi2) + "\nGirdi�iniz say�lar�n fark� :" + (sayi1-sayi2) + "\nGirdi�iniz say�lar�n �arp�m�:" + (sayi1*sayi2));
		
	}

}
