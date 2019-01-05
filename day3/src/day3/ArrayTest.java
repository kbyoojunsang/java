package day3;

public class ArrayTest { //중괄호 포함의 의미

	public static void main(String[] args) {
		int[] n = new int[100];  //대괄호는 함수의 의미, 0부터 100개(0포함)  0~99
		n[0] = 100; // 배열은 0부터 시작한다.
		n[1] = 200;
		n[99] = 900;
				
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[99]);
		System.out.println(n[88]); // 배열은 자동으로 초기값이 0 으로 세팅된다!
		
					
	}

}