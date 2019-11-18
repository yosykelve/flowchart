package lesson9;

import java.util.Scanner;
public class No94 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer Flag = 1;
		System.out.println("お酒の種類を入力してください。"
				+ "１：ビール、２：日本酒、３ウイスキー");
		Scanner scan = new Scanner(System.in);
		Integer type = scan.nextInt();
		double alcohol = 0;
		//お酒の種類を入力
		//入力された数字の判定
		do {
			if(type == 1 || type == 2 || type == 3) { //入力された数字が正しかったら
				Flag = 0;
			}else {	//入力された数字が正しくなかった
				System.out.println("無効な数字です。正しい数字を入力して下さい");
			}
		}while(Flag == 1);

		//お酒の量を入力
		System.out.println("お酒の量(ml)をにゅうりょくしてください");
		Integer amount = scan.nextInt();
		//アルコール量の計算
		switch(type) {
		case 1:
			alcohol = amount * 0.05; //ビールのアルコール度数は5%
			break;
		case 2:
			alcohol = amount * 0.15; //日本酒のアルコール度数は15%
			break;
		case 3:
			alcohol = amount * 0.43; //ウイスキーのアルコール度数は43%
		}
		//アルコール量の表示
		System.out.println("アルコール量は" + alcohol +"mlです");
	}

}
