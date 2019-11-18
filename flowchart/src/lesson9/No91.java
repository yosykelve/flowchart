package lesson9;

import java.util.Scanner;

public class No91 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String metabo = "No";
		System.out.println("男性は１を、女性は２を入力してください：");
		Scanner scan = new Scanner(System.in);
		Integer seibetsu = scan.nextInt();
		System.out.println("ウエストをセンチで入力してください：");
		Integer waist = scan.nextInt();
		//メタボリック症候群の判定
		if(seibetsu == 1) { //男性だったら
			if(waist >= 85) {
				metabo = "Yes";
			}else {
				if(waist >= 90) { //女性だったら
					metabo = "Yes";
				}
			}
		}
		if(metabo == "No") {
			System.out.println("あなたはメタボではありません");
		}else {
			System.out.println("あなたはメタボの疑いがあります");
		}
	}

}
