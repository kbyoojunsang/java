package window2;

import java.util.Scanner;

public class Cal2 {

	public int myCal(int x, int y) {
		return x + y + 100;  
	}

	public void add(int x, int y) { // int 값 최소 2개 들어와야 한다.
		System.out.println("두 수의 합은 " + (x + y));
	}

	public void minus(int x, int y) { // int 값 최소 2개 들어와야 한다.
		System.out.println("두 수의 차은 " + (x - y));
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public void div(int x, int y) { // int 값 최소 2개 들어와야 한다.
		System.out.println("두 수의 나눗셈은 " + (x / y));
	}
}
