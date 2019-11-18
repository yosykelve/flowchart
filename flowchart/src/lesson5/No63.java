package lesson5;

import java.util.Scanner;

public class No63 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		Integer b = scan.nextInt();
		Integer c;
		if(a == 3) {
			if(b == 3) {
				c = a + b;
			}else {
				c = a - b;
			}
		}else {
			c = a * b;
		}
		System.out.println("cの値は" + c + "です");
	}

}
