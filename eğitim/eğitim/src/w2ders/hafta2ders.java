package w2ders;

import java.util.Scanner;

public class hafta2ders {
	
	public static void main(String[]args){
		
		/* \t println i�inde araya 1 tab bo�luk koyar
	        math library ile matematiksel i�lemler yap�labilir 
	    */
		
		Scanner kb = new Scanner(System.in);
		String kelime = "BTK Akademi" ;
		System.out.println(kelime.length()); // stringin uzunlu�unu s�yler
		System.out.println(kelime.toUpperCase()); // stringin b�t�n karakterlerini b�y�k yapar
		System.out.println(kelime.toLowerCase()); // stringin b�t�n karakterlerini k���k yapar
		System.out.println("Bir c�mle girin");
		String cumle = kb.nextLine();
		System.out.println("Girilen c�mle " + cumle);
		System.out.println("C�mlenin b�y�k harfli hali " + cumle.toUpperCase());
		System.out.println("C�mlenin k���k harfli hali " + cumle.toLowerCase());
		System.out.println("C�mlenin 4. karakteri " + cumle.charAt(3)); // stringin hangi indexini istersek onu yazd�rmam�z� sa�lar
		char ilk_index = cumle.charAt(0);
		System.out.println("�lk karakter " + ilk_index); // Bu �ekilde string ifadenin ilk karakteri bulunabilir
		int son_index = cumle.length()-1 ; // Bu �ekilde string ifadenin son karakteri bulunabilir
		char son_karakter = cumle.charAt(son_index); 
		System.out.println("Son karakter " + son_karakter);
		String s1 = "BTK ";
		String s2 = "akademi ";
		String s2_1 = (s2.substring(3)); // substring metodu stringi verilen parametreden b�ler
		System.out.println(s2_1);
		System.out.println(s1.equals(s2));// equal iki string 1-1 ayn� m� de�il mi kontrol eder
		System.out.println(s1.equalsIgnoreCase(s2));// ignorecaseequal iki string 1-1 ayn� m� de�il mi kontrol eder fakat bo�luklar� g�rmezden gelir 
		System.out.println(s2.lastIndexOf("a"));// lastindexof string i�inde verilen parametrenin son hangi indexte oldu�unu s�yler
		System.out.println(s2.indexOf("a"));// indexof string i�inde verilen parametrenin ilk hangi indexte oldu�unu s�yler
		
		Scanner klavye = new Scanner(System.in);
		String ikilik_cumle = klavye.nextLine();
		System.out.println("�ki kelimelik bir c�mle girin ");
		int bosluk = ikilik_cumle.indexOf(" ");
		String ilk  = ikilik_cumle.substring(0,bosluk);
		String iki = ikilik_cumle.substring(bosluk+1);
		System.out.println("Bo�luktan b�l�nm�� hali " + ilk + "\n" + iki);
		
	
		
		
	}

}
