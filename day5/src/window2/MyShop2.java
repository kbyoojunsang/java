package window2;

import java.util.Scanner;

public class MyShop2 {

	public static void main(String[] args) {
		int price = 5000; // 커피값 5천원 세팅
		// 입력값으로 세팅하기 스캐너!!
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 인원을 입력해주세요.");
		System.out.print("주문인원: ");

		int input = sc.nextInt();

		Cal2 cal2 = new Cal2();
		int sum = cal2.mul(input, price);

		// if 두번째꺼 사용 : 2만원 초과, 2만원 이하
		// 2만원 초과시 3천원 깍아줌
		if (sum >= 20000) {
			System.out.println("내실 금액은 " + (sum - 3000) + "원");
		} else {
			System.out.println("내실 금액은 " + sum + "원");
		}
	}

}
