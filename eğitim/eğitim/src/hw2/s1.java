

package hw2;

import java.util.Scanner;

public class s1 {
	
	public static void main(String[]args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir kelime girin ");
		String kelime = klavye.nextLine();
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		
		
		
	}

}
