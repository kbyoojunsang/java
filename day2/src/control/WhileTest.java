package control;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 3;  /* = -> 값을넣어주는 대입연산자 */ 
		// ① 초기값
		
		while (num<5) {   // ② 조건 			
				System.out.println("☎");
				num++;   /* ++ -> 증감연산자 (1씩 증가시켜준다) */  // ③ 증감값
		}		
	/*	while (true) {   // 무한루프 : 계속 참이라서, 계속 작동한다. 거짓이 들어오기전까지 무한루프다 			
			System.out.println("☎");  				
		}  */
	}
}

