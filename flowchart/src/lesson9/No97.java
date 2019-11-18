package lesson9;

import java.util.Scanner;

public class No97 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Flag = "ON";
		double goukei = 0;
		double zeiritsu = 1.1;
		Scanner scan = new Scanner(System.in);

		//商品の値段を合算する
		do {
			System.out.println("商品の価格を入力してください。終了する場合は[e]を入力してください");
			Integer nedan = scan.nextInt();
			String str = "e";
			int e = Integer.parseInt(str);
			if(nedan != e) {
				goukei = goukei + nedan;
			}else {
				Flag = "OFF";
			}
		}while(Flag == "ON");

		//消費税の計算
		goukei = goukei * zeiritsu;
		System.out.println("商品の合計金額は消費税込みで" + goukei + "円です");
	}

}
