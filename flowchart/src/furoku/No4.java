package furoku;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		Integer nenrei = scan.nextInt();
		System.out.println("生まれた年を西暦で入力してください");
		Integer umare = scan.nextInt();
		Integer kakaku = 0;
		if(nenrei <= 10 && umare == 2001) {
			 kakaku = 100;
		}else{
			kakaku = 500;
		}
		System.out.println("価格は" + kakaku + "円です");
	}

}
