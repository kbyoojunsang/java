package control;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 선택하세요. 1)짬뽕, 2)회, 3)라면 ");
		
		int food = sc.nextInt();
		
		if (food==1) {
			System.out.println("중국집으로 가세요");
			
		} else if(food==2){
			System.out.println("일식집으로 가세요");

		} else if(food==3) {
			System.out.println("분식집으로 가세요");
		} else {
			System.out.println("안먹어요");
			}
		}
	}
		
// 조건문 switch 