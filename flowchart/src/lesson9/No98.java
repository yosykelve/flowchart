package lesson9;

import java.util.Scanner;
public class No98 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Flag = "ON";
		Integer goukei = 0;
		Integer count = 1;

		//商品の値段を合算する
		do {
			System.out.println(count + "番目の商品の値段を入力してください。終了する場合は[e]を入力してください");
			Scanner scan = new Scanner(System.in);
			String nedan = scan.nextLine();
			String str = "e";
			if(nedan.equals(str)) {
				Flag = "OFF";
				System.out.println("終了");
			}else{
				Integer nedan2 = Integer.parseInt(nedan);
				goukei += nedan2;
				System.out.println(goukei);
				count += 1;

			}
		}while(Flag != "OFF");

//		平均値の計算
		if(count == 0) {
			System.out.println("商品が入力されていないため、計算できませんでした");
		}else {
			Integer heikin = goukei / count;
			System.out.println("商品" + count + "個の合計額は" + goukei + "円、" + "平均額は" + heikin + "円です") ;


		}

	}

}

