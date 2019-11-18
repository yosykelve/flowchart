package lesson5;

import java.util.Scanner;

public class No60 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		if(a == 1) {
			a = a + 1;
		}else {
			a = a - 1;
		}
		System.out.println("処理結果は" + a + "です");
	}
}
