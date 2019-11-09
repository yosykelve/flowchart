package lesson4;

public class No44 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer nenrei = 5;
		Integer kakaku = 0;
		if(nenrei == 0) {
			kakaku = 100;
			System.out.println("年齢が0歳の時、価格は" + kakaku + "円です");
		}else if(nenrei == 1) {
			kakaku = 300;
			System.out.println("年齢が1歳の時、価格は" + kakaku + "円です");
		}else if(nenrei == 2) {
			kakaku = 300;
			System.out.println("年齢が2歳の時、価格は" + kakaku + "円です");

		}else {
			kakaku = 500;
			System.out.println("年齢が0〜2歳以外の時、価格は" + kakaku + "円です");
		}
	}

}

