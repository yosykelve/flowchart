package lesson5;

import java.util.Scanner;

public class No64 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		Integer b = 5;
		do {
			a = a + 1;
		}while( a < b);
		System.out.println("aの値は" + a + "です。");
	}

}
