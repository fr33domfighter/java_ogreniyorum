package w3;

import java.util.Scanner;

public class hafta3ders {
	
	public static void main(String[]args){
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Bir say� girin");
		int sayi = kb.nextInt();
		if (sayi == 35) // e�er ko�ul sa�lan�rsa �al��
			System.out.println("Girdi�iniz say� 35'e e�it ");
		else // e�er ko�ul sa�lanmazsa �al��
			System.out.println("Girdi�iniz say� 35'e e�it de�il");
		
		// and => && , or => || ile g�sterilir
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir say� girin");
		int sayi1 = kb.nextInt();
		if (sayi1 < 0)
			System.out.println("Say� negatif");
		else if (sayi > 0 )
			System.out.println("Say� pozitif");
		else 
			System.out.println("say� 0");
		
		// lahmacun hamburger pizza yemek uygulamas� yap 
		// m��teri 2-3 �ey birden isteyebilsin
		
		Scanner siparis = new Scanner(System.in);
		System.out.println("L�tfen sipari� giriniz ");
		String yemek = kb.nextLine();
		yemek = yemek.toLowerCase();
		String temp = "";
		int hesap = 0 ;
		if (yemek.indexOf("lahmacun") != -1)
			temp += "lahmacun";
			hesap += 15;
		if (yemek.indexOf("hamburger") != -1)
			temp += "hamburger";
			hesap += 40;
		if (yemek.indexOf("pizza") != -1)
			temp += "pizza";
			hesap += 25;
		System.out.println("sipari�iniz" + temp + "Hesab�n�z : " + hesap);
		
		Scanner yas = new Scanner(System.in);
		System.out.println("Ya��n�z� giriniz:");
		int yas1 = kb.nextInt();
		kb.nextLine();
		System.out.println("��renim seviyenizi yaz�n");
		String okul = kb.nextLine();
		if (yas1 <= 18 )
		if (okul.equalsIgnoreCase("�niversite") )
				System.out.println("alabilir");
		else 
			System.out.println("Hen�z re�it de�ilsin");
		
		
		String c1 = kb.next();
		int a = 5 ;
		int b = 3 ;
		//switch (key) {
		//case value: {
			
			//yield type;
		//}
		//default:
			//throw new IllegalArgumentException("Unexpected value: " + key);
		//}
		
		
		// otob�s bileti uyg
		//Scanner kb = new Scanner(System.in);
		//System.out.println("Ya��n�z� giriniz:");
		//int yas = kb.nextInt();
		//if (yas )
		
		// && de ilk ko�ula bakar di�erine bakmaz , & de iki ko�ula da bak�l�r
		// || veya anlam�na gelir	
		
		// stringin ilk ve son karakteri ayn�ysa 
			
			
			
			
		
		
			
		
		
		
		
		
	}

}
