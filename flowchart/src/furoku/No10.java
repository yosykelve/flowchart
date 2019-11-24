package furoku;

import java.util.Scanner;

public class No10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String Flag = "ON";
		do {
		System.out.println("モードを選択してください(1 or 2)。0を入力すると終了します");
		Scanner scan = new Scanner(System.in);
		Integer mode = scan.nextInt();
		//モード判定
			if(mode == 1) {
				calcage();
			}else if(mode==2) {
				calcyear();
			}else if(mode == 0){
				System.out.println("終了します");
				Flag = "OFF";
			}else {
				System.out.println("正しいモードが入力されませんでした。やり直してください");
			}
		}while(Flag=="ON");
	}

	public static void calcage(){
		System.out.println("調べたい年を西暦で入力してくだいさい");
		Scanner scan = new Scanner(System.in);
		Integer year = scan.nextInt();
		System.out.println("生まれた年を西暦で入力してくだいさい");
		Integer umare = scan.nextInt();
		Integer nenrei = year - umare;
		System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
	}

	public static void calcyear() {
		System.out.println("調べたい年齢を入力してくだいさい");
		Scanner scan = new Scanner(System.in);
		Integer nenrei = scan.nextInt();
		System.out.println("生まれた年を西暦で入力してくだいさい");
		Integer umare = scan.nextInt();
		Integer year = nenrei + umare;
		System.out.println("あなたが" + nenrei + "歳のときは西暦" + year + "年です");
	}

}
