package lesson5;

import java.util.Scanner;

public class No61 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		if(a == 1) {
			a = a + 1;
		}else if(a == 2){
			a = a + 2;
		}else if(a == 3){
		a = a + 3;
		}else {
			a = a - 1;
		}
		System.out.println("aの値は" + a + "です");

	}

}
