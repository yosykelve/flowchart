package lesson9;

import java.util.Scanner;

public class No100 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Flag = "ON";
		Integer rate = 113;

		//モード選択
		do {
			System.out.println("計算(1)、レート設定(2)、終了(3)から希望する数字を入力してください:");
			Scanner scan = new Scanner(System.in);
			Integer mode = scan.nextInt();
			switch(mode) {
			case 1:
				keisan(rate);
				break;
			case 2:
				settei(rate);
				break;
			case 3:
				Flag = "OFF";
				break;
			default:
				System.out.println("モードが正しくありません");
			}
		}while(Flag == "ON");
	}
		//計算モード
	public static void keisan(Integer rate) {
		System.out.println("金額を日本円で入力してください:");
		Scanner scan = new Scanner(System.in);
		Integer yen = scan.nextInt();
		Integer dollar = yen * rate;
		System.out.println("現在のレード（" + rate + ")で" + dollar + "ドルです");
	}

		//レート設定モード
	public static void settei(Integer rate) {
		System.out.println("現在のレートは" + rate + "です。新しいレートを入力してください");
		Scanner scan = new Scanner(System.in);
	    rate = scan.nextInt();
	    System.out.println("新しいレート" + rate + "に更新されました");
	}

}
