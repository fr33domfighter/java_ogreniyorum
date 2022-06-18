package w3;

import java.util.Scanner;

public class hafta3ders {
	
	public static void main(String[]args){
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Bir sayý girin");
		int sayi = kb.nextInt();
		if (sayi == 35) // eðer koþul saðlanýrsa çalýþ
			System.out.println("Girdiðiniz sayý 35'e eþit ");
		else // eðer koþul saðlanmazsa çalýþ
			System.out.println("Girdiðiniz sayý 35'e eþit deðil");
		
		// and => && , or => || ile gösterilir
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayý girin");
		int sayi1 = kb.nextInt();
		if (sayi1 < 0)
			System.out.println("Sayý negatif");
		else if (sayi > 0 )
			System.out.println("Sayý pozitif");
		else 
			System.out.println("sayý 0");
		
		// lahmacun hamburger pizza yemek uygulamasý yap 
		// müþteri 2-3 þey birden isteyebilsin
		
		Scanner siparis = new Scanner(System.in);
		System.out.println("Lütfen sipariþ giriniz ");
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
		System.out.println("sipariþiniz" + temp + "Hesabýnýz : " + hesap);
		
		Scanner yas = new Scanner(System.in);
		System.out.println("Yaþýnýzý giriniz:");
		int yas1 = kb.nextInt();
		kb.nextLine();
		System.out.println("öðrenim seviyenizi yazýn");
		String okul = kb.nextLine();
		if (yas1 <= 18 )
		if (okul.equalsIgnoreCase("üniversite") )
				System.out.println("alabilir");
		else 
			System.out.println("Henüz reþit deðilsin");
		
		
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
		
		
		// otobüs bileti uyg
		//Scanner kb = new Scanner(System.in);
		//System.out.println("Yaþýnýzý giriniz:");
		//int yas = kb.nextInt();
		//if (yas )
		
		// && de ilk koþula bakar diðerine bakmaz , & de iki koþula da bakýlýr
		// || veya anlamýna gelir	
		
		// stringin ilk ve son karakteri aynýysa 
			
			
			
			
		
		
			
		
		
		
		
		
	}

}
