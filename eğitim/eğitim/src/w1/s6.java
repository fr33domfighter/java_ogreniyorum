package w1;

import java.util.Scanner;

public class s6 {
	
	public static void main(String[]args){
		
		Scanner kw = new Scanner(System.in);
		System.out.println("Bir sayý girin ");
		int sayi = kw.nextInt();
			sayi = ++sayi;
		System.out.println(sayi);
			sayi *=5;
		System.out.println(sayi);
		
	}

}
