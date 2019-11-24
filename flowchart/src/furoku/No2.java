package furoku;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		Integer nenrei = scan.nextInt();
		Integer  kakaku = 0;
		//年齢が0歳だったら
		if(nenrei == 0) {
			kakaku = 100;
		//年齢が0歳ではなかったら
		}else {
			kakaku = 500;
		}
		System.out.println("価格は" + kakaku + "円です");
	}

}
