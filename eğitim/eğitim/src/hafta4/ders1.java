package hafta4;

import java.util.*;

public class ders1 {
	
public static void main(String[]args) {
	
	
	//int sayac = 0;	 
	//while (sayac <=5 ) {
		//System.out.println("a = " + sayac + "*");
		//sayac++;
		
	//}
	
	//Scanner klavye = new Scanner(System.in);
	//String kelime = klavye.nextLine();
	//System.out.println("�sminizi girin ");
	//int uzunluk = kelime.length()-1;
	//int sayac1 = 0; 
	//while (0 <= uzunluk) {
		//System.out.println(kelime.charAt(sayac1));
		//uzunluk--;
	
	
	Scanner klavye = new Scanner(System.in);
	System.out.println("bir say� girin");
	int sayi = klavye.nextInt();
	int sayac = 1 ;
	int toplam = 0 ;
	int carpim = 1 ;
	while (sayi >= sayac ) {
		toplam+= sayac ;
	    sayac++;
	}
	double ort = toplam/sayi ;
	System.out.println(ort);
	System.out.println(toplam);	
	
	
	
	
   }

}
