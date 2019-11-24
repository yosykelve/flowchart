package furoku;

import java.util.Scanner;
public class No1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("１つ目の数字を入力してください");
		Integer a = scan.nextInt();
		System.out.println("２つ目の数字を入力してください");
		Integer b = scan.nextInt();
		Integer c = a + b;
		System.out.println("足し算しました：" + c);
		c += 1;
		System.out.println("結果は" + c + "");
	}

}
