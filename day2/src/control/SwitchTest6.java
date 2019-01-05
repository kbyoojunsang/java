package control;
import java.util.Date;
import java.util.Scanner;
public class SwitchTest6 {
	public static void main(String[] args) {
	
		Date date = new Date();
		int mon = date.getMonth()+1;
		// month 만  +1을 해줘야 한다.
		
		System.out.print(mon + "월 ");
				
		switch (mon) {
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
			
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("봄");
			break;
		case 7:
		case 8:
			System.out.println("여름");
			break;
		default:
			System.out.println("가을");
			break;
		}
	}
}