package lesson4;

public class No47 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double yokin = 10000;
		Integer mokuhyo = 14000;
		do {
			yokin = yokin * 1.1;
			System.out.println("預金は" + yokin + "円です");
		}while(yokin < mokuhyo);
	}

}
