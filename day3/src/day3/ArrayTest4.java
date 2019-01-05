package day3;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in 은 키보드 입력을 뜻함
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print("점수입력....");
			num[i] = sc.nextInt();
		}

		for (int n : num) {
			System.out.println(n);
		}

		// 33의 위치를 찾고 싶을때
		/*
		 * for (int i = 0; i < num.length; i++) { if (num[i] == 33) {
		 * System.out.println("위치는 " + i);// if 쓸때는 if 바로 뒤에 소괄호 () 사용!! }
		 */

		// 찾고싶은 값을 입력하여, 그 값의 위치를 찾을때
		/*
		 * System.out.print("찾고싶은 값을 입력 -> "); int find = sc.nextInt(); for (int i = 0;
		 * i < num.length; i++) { if (num[i] == find) { System.out.println("위치는 " +
		 * i);// if 쓸때는 if 바로 뒤에 소괄호 () 사용!! }
		 */

		// 최소값 구하기!!! , mini 값을 시작부터 세팅하여, 비교하여 작은 값을 넣도록
		int mini = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < mini) {
				mini = num[i];
			}
		}
		System.out.println("최소값은 " + mini);
				
		// 최대값 구하기!!! , maxi 값을 시작부터 세팅하여, 비교하여 큰 값을 넣도록
		int maxi = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maxi) {
				maxi = num[i];
			}
		}
		System.out.println("최대값은 " + maxi);
	}
}
