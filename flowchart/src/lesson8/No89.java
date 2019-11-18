package lesson8;

import java.util.Scanner;

public class No89 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		Integer b = scan.nextInt();
		Integer count = 0;
		Integer Flag = 1;
		do {
			if(a > 2 && b > 2) {
				Flag = 0;
			}else {
				if(a > b) {
					b = b + 1;
				}else {
					a = a + 1;
				}
			count = count + 1;
			}
		}while(Flag == 1);
		System.out.println("足し算をした回数は" + count + "回です");
	}

}
