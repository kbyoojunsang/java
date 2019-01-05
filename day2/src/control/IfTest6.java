package control;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도 : ");
		int year = sc.nextInt();
		int age = 2019 - year + 1;
		
		if (age>=19) {
			System.out.println("성인입니다.");		
		} else {
			System.out.println("미성년자입니다.");
		}		

	}

}
