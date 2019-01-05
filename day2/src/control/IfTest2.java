package control;

public class IfTest2 {

	public static void main(String[] args) {
		int id = 1000;
		int pw = 2000;
				
		if (id==1000 && pw==2000) {     /*   && 그리고,  || 또는      */     
			System.out.println("로그인 Ok!");
		}else {
			System.out.println("로그인 No!");
		}
	}
}