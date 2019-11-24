package furoku;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		Integer nenrei = scan.nextInt();
		Integer  kakaku = 0;
		if(nenrei <= 12) {
			 kakaku = 0;
		}else if(nenrei <= 15){
			kakaku = 300;
		}else{
			kakaku = 500;
		}
		System.out.println("価格は" + kakaku + "円です");
	}

}
