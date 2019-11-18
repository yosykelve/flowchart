package lesson8;

public class No81 {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		for(Integer i = 1; i <= 3; i++) {
			if(a > b){
				b = b + 1;
			}else {
				a = a + 1;
			}
		}
		System.out.println("a =" + a + "、b =" + b);
	}

}
