package lesson9;

import java.util.Scanner;

public class No96 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("モードを選択してください。（１or 2)");
		Scanner scan = new Scanner(System.in);
		Integer mode = scan.nextInt();
		System.out.println("生まれた歳を西暦で入力してください");
		Integer umare = scan.nextInt();

		//モード判定
		if(mode == 1) {
			calcage(umare);
		}else if(mode == 2) {
			calcyear(umare);
		}else {
			System.out.println("正しいモードが入力されませんでした。プログラムを終了します。");
		}

	}
		public static void calcage(Integer umare) {
			System.out.println("調べたい歳を西暦で入力してください");
			Scanner scan = new Scanner(System.in);
			Integer year = scan.nextInt();
			Integer nenrei = year - umare;
			System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
		}

		public static void calcyear(Integer umare) {
			System.out.println("調べたい年齢を入力してください");
			Scanner scan = new Scanner(System.in);
			Integer nenrei = scan.nextInt();
			Integer year = nenrei + umare;
			System.out.println("あなたが" + nenrei + "歳の時は西暦" + year + "年です。");
		}
}


