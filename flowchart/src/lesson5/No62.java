package lesson5;

import java.util.Scanner;

public class No62 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		Integer b = scan.nextInt();
		Integer c = scan.nextInt();
		Integer d;
		if(a == 2 && b == 1 && c == 2){
			d = a + b + c;
		}else {
			d = a + b - c;
		}
		System.out.println("dの値は" + d + "です");
	}

}
