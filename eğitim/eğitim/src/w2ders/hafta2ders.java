package w2ders;

import java.util.Scanner;

public class hafta2ders {
	
	public static void main(String[]args){
		
		/* \t println içinde araya 1 tab boþluk koyar
	        math library ile matematiksel iþlemler yapýlabilir 
	    */
		
		Scanner kb = new Scanner(System.in);
		String kelime = "BTK Akademi" ;
		System.out.println(kelime.length()); // stringin uzunluðunu söyler
		System.out.println(kelime.toUpperCase()); // stringin bütün karakterlerini büyük yapar
		System.out.println(kelime.toLowerCase()); // stringin bütün karakterlerini küçük yapar
		System.out.println("Bir cümle girin");
		String cumle = kb.nextLine();
		System.out.println("Girilen cümle " + cumle);
		System.out.println("Cümlenin büyük harfli hali " + cumle.toUpperCase());
		System.out.println("Cümlenin küçük harfli hali " + cumle.toLowerCase());
		System.out.println("Cümlenin 4. karakteri " + cumle.charAt(3)); // stringin hangi indexini istersek onu yazdýrmamýzý saðlar
		char ilk_index = cumle.charAt(0);
		System.out.println("Ýlk karakter " + ilk_index); // Bu þekilde string ifadenin ilk karakteri bulunabilir
		int son_index = cumle.length()-1 ; // Bu þekilde string ifadenin son karakteri bulunabilir
		char son_karakter = cumle.charAt(son_index); 
		System.out.println("Son karakter " + son_karakter);
		String s1 = "BTK ";
		String s2 = "akademi ";
		String s2_1 = (s2.substring(3)); // substring metodu stringi verilen parametreden böler
		System.out.println(s2_1);
		System.out.println(s1.equals(s2));// equal iki string 1-1 ayný mý deðil mi kontrol eder
		System.out.println(s1.equalsIgnoreCase(s2));// ignorecaseequal iki string 1-1 ayný mý deðil mi kontrol eder fakat boþluklarý görmezden gelir 
		System.out.println(s2.lastIndexOf("a"));// lastindexof string içinde verilen parametrenin son hangi indexte olduðunu söyler
		System.out.println(s2.indexOf("a"));// indexof string içinde verilen parametrenin ilk hangi indexte olduðunu söyler
		
		Scanner klavye = new Scanner(System.in);
		String ikilik_cumle = klavye.nextLine();
		System.out.println("Ýki kelimelik bir cümle girin ");
		int bosluk = ikilik_cumle.indexOf(" ");
		String ilk  = ikilik_cumle.substring(0,bosluk);
		String iki = ikilik_cumle.substring(bosluk+1);
		System.out.println("Boþluktan bölünmüþ hali " + ilk + "\n" + iki);
		
	
		
		
	}

}
