package hw2;

import java.util.Scanner;
import java.math.*;

public class s3 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Yar??ap bilgisini girin : ");
		int cap = klavye.nextInt();
		double pi = 3.14 ;
		System.out.println("?emberin ?evresi : " + 2*pi*cap );
		System.out.println("Dairenin Alan? : " + cap*cap*pi  );
		
	}
}
