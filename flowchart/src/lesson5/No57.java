package lesson5;

import java.util.Scanner;

public class No57 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1つ目の数字を入力してください：");
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		System.out.println("2つ目の数字を入力してください：");
		Integer b = scan.nextInt();
		System.out.println("合計は" +(a + b) + "、平均は" + (a + b) / 2 + "です");

	}

}
