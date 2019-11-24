package lesson9;

import java.util.Scanner;

public class No97 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Flag = "ON";
		double goukei = 0;
		double zeiritsu = 1.08;


		//商品の値段を合算する
			System.out.println("商品の値段を入力してください。終了する場合は[e]を入力してください");
			Scanner scan = new Scanner(System.in);
			String nedan = scan.nextLine();
			String str = "e";
			if(nedan.equals(str)) {
				Flag = "OFF";
			}else{
				Double nedan2 = Double.parseDouble(nedan);
				goukei += nedan2;
			}

		//消費税の計算
		goukei = goukei * zeiritsu;
		System.out.println("商品の合計金額は消費税込みで" + goukei + "円です");
	}

}
