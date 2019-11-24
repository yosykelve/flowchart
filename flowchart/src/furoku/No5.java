package furoku;

import java.util.Scanner;
public class No5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		Integer b = 5;
		Integer count = 0;
		while(a < b) {
			a++;
			count++;
		}
		System.out.println("繰り返した回数は" + count + "回です");
	}

}
