package furoku;

import java.util.Scanner;
public class No7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a = 0;
		Integer b = 0;
		Scanner scan = new Scanner(System.in);
		Integer j = scan.nextInt();

	for(int i = 1; i <= j; i++) {
			if(a > b) {
				b++;
				System.out.println("a=" + a + "b=" + b + "i=" + i);
			}else {
				a++;
				System.out.println("a=" + a + "b=" + b + "i=" + i);

			}
		}
	}

}
