package w1;

import java.util.Scanner;

public class s3 {
	
	public static void main(String[]args) {
		
		Scanner kw = new Scanner(System.in);
		System.out.println("Birinci sayýyý girin :");
		int sayi1 = kw.nextInt();
		System.out.println("Ýkinci sayýyý girin :");
		int sayi2 = kw.nextInt();
		System.out.println("Üçüncü sayýyý girin :");
		int sayi3 = kw.nextInt();
		double ort = (sayi1+sayi2+sayi3)/3.0;
		System.out.println("Girdiðiniz sayýlarýn aritmetik ortalamasý :" + ort );
		
	}

}
