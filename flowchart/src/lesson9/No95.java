package lesson9;

import java.util.Scanner;
public class No95 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1つめの商品の量（g）を入力してください：");
		Scanner scan = new Scanner(System.in);
		Integer ryou1 = scan.nextInt();
		System.out.println("1つめの商品の値段（円）を入力してください：");
		Integer nedan1 = scan.nextInt();
		System.out.println("2つめの商品の量（g）を入力してください：");
		Integer ryou2 = scan.nextInt();
		System.out.println("2つめの商品の値段（円）を入力してください：");
		Integer nedan2 = scan.nextInt();

		//100gあたりの値段を計算
		Integer shohin1 = (nedan1 / ryou1) * 100;
		Integer shohin2 = (nedan2 / ryou2) * 100;

		//損得計算
		if(shohin1 < shohin2) {
			System.out.println("１つ目の商品が100gあたり、" + (shohin2 - shohin1) + "円お得です");
		}else if(shohin1 > shohin2) {
			System.out.println("１つ目の商品が100gあたり、" + (shohin1 - shohin2) + "円お得です");
		}else {
			System.out.println("どちらの商品でも差はありません");
		}

	}

}
