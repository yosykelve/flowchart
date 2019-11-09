package lesson4;

public class No46 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double yokin = 10000;
		for(Integer nensu = 1; nensu <= 3; nensu++) {
			System.out.println("年数" + nensu + "年め、預金は" + yokin + "円です");
			yokin = yokin * 1.1;
		}
	}

}
