package lesson8;

public class No86 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a = 0;
		Integer b = 0;
		Integer count = 0;
		Integer Flag = 0;
		do {
			if(a > b) {
				b = b + 1;
			}else {
				a = a + 1;
			}
			if(a > 2 && b > 2) {
				Flag = 0;
			}
			count = count + 1;
		}while(Flag == 1);
			System.out.println("a=" + a + "、b=" + b + "、Flag=" + Flag);
	}

}
