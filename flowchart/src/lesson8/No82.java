package lesson8;

public class No82 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a = 0;
		Integer b = 0;
		for(int i = 1; i <= 3; i++) {
			if(a > b) {
				b = b + 1;
				System.out.println("a=" + a + "、b=" + b);
			}else {
				a = a + 1;
				System.out.println("a=" + a + "、b=" + b);
			}
		}
	}

}
