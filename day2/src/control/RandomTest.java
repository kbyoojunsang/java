package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// ctrl + shift + O(알파벳 오) 
				
		Random r = new Random();
		int sum=0;
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(3);
			// 3보다 작은값을 생성
			System.out.println(num);
			sum= sum + num;
		}
		System.out.println(sum);
	}
}