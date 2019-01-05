package control;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
		
		int dif1 = no1 - no2;
		int dif2 = no2 - no1;
		
		if (no1>no2) {
			System.out.println("첫번째 숫자 " + no1 + "이(가) " + "두번째 숫자 " +no2 + "보다 " + dif1 + "만큼 더 큽니다.");
		} else if(no1==no2){
			System.out.println("숫자가 같습니다.");
		} else {
			System.out.println("두번째 숫자 " + no2 + "이(가) " + "첫번째 숫자 " + no1 + "보다 " + dif2 + "만큼 더 큽니다.");
		}
	}
}