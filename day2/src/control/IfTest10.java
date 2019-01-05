package control;

import java.util.Scanner;

public class IfTest10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 선택하세요. 1)짬뽕, 2)회, 3)라면 ");
		
		int food = sc.nextInt();
	
		switch(food) {
		/*여러개*/
		case 1:
			System.out.println("중국집으로 가요");
			break;
			/*순차적이므로, break을 통해 해당시 중지 */
		case 2:
			System.out.println("일식집으로 가요");
			break;
		case 3:
			System.out.println("분식집으로 가요");
			break;			
		default:
			System.out.println("안먹어요");
			// 조건이 많을경우cass와 default 사용함
		}
		
	}
	}
		
// 조건문 switch 