package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* 복사해서 쓰는 개념인  new 라는 키워드를 쓴다. 4000개를 복사할때 */
		/* System.in  키보드에서 입력한 것을 갖고 들어온다는 개념 */

		System.out.print("아이디를 입력해 주세요. ->> ");
		/* println 에서 ln 빼면  줄바꿈 안함. */
		int input1 = sc.nextInt();
		/* 내가 입력한것을 숫자로 변환해서 갖고 들어오는 명령 : nextInt */
		
		System.out.print("패스워드를 입력하세요 ->> ");
		int input2 = sc.nextInt();
				
		System.out.println("당신의 입력한 아이디는 " + input1 + "입니다.");
		System.out.println("당신의 입력한 패스워드는 " + input2 + "입니다.");
		
		if(input1==1000 && input2==1234) {
			System.out.println("로그인 Ok!");
		}else {
			System.out.println("로그인 No!");
						
		}
		
	}

}