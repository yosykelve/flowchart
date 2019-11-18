package lesson9;

import java.util.Scanner;
public class No98 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		nyuryoku();
	}
		//入力処理
		public static void nyuryoku() {
			System.out.println("１つ目の商品の量(g)を入力してください:");
			Scanner scan = new Scanner(System.in);
			Integer ryou1 = scan.nextInt();
			System.out.println("１つ目の商品の値段(円）を入力してください:");
			Integer nedan1 = scan.nextInt();

			System.out.println("2つ目の商品の量(g)を入力してください:");
			Integer ryou2 = scan.nextInt();
			System.out.println("2つ目の商品の値段(円）を入力してください:");
			Integer nedan2 = scan.nextInt();
			keisan(nedan1, ryou1, nedan2, ryou2);
		}

		//計算処理
		public static void keisan(Integer nedan1, Integer ryou1, Integer nedan2, Integer ryou2) {
			//100gあたりの値段を計算
			Integer shohin1 = (nedan1 / ryou1) * 100;
			Integer shohin2 = (nedan2 / ryou2) * 100;
			shutsuryoku(shohin1, shohin2);
		}

		//出力処理
		public static void shutsuryoku(Integer shohin1, Integer shohin2) {
			//損得計算
			if(shohin1 > shohin2) {
				System.out.println("1つめの商品が、100gあたり" + (shohin2 - shohin1) + "円お得です");
			}else if(shohin1 > shohin2) {
				System.out.println("2つめの商品が、100gあたり" + (shohin1 - shohin2) + "円お得です");
			}else {
				System.out.println("どちらの商品でも差はありません");
			}
		}
	}

