package w1;

import java.util.Scanner;

public class s3 {
	
	public static void main(String[]args) {
		
		Scanner kw = new Scanner(System.in);
		System.out.println("Birinci say�y� girin :");
		int sayi1 = kw.nextInt();
		System.out.println("�kinci say�y� girin :");
		int sayi2 = kw.nextInt();
		System.out.println("���nc� say�y� girin :");
		int sayi3 = kw.nextInt();
		double ort = (sayi1+sayi2+sayi3)/3.0;
		System.out.println("Girdi�iniz say�lar�n aritmetik ortalamas� :" + ort );
		
	}

}
