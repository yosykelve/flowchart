package lesson9;

import java.util.Scanner;

public class No93 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの身長(m)を入力してください：");
		Scanner scan = new Scanner(System.in);
		double height = scan.nextDouble();
		System.out.println("あなたの体重(kg)を入力してください：");
		double weight = scan.nextDouble();
		//BMIの計算
		double BMI = weight / (height * height);

		//BMIから肥満度を判定
		if(BMI >= 18.5) {
			System.out.println("あなたのBMIは" + BMI + "です。痩せています");
		}else if(BMI >= 18.5 && BMI < 25) {
			System.out.println("あなたのBMIは" + BMI + "です。標準的です");
		}else if(BMI >= 25 && BMI < 30) {
			System.out.println("あなたのBMIは" + BMI + "太り気味です");
		}else if(BMI >= 30) {
			System.out.println("あなたのBMIは" + BMI + "です。太りすぎです");
		}else {
			System.out.println("BMIが正しく計算できませんでした。");
		}
	}

}
