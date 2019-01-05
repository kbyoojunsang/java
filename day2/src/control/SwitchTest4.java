package control;
import java.util.Date;
import java.util.Scanner;
public class SwitchTest4 {
	public static void main(String[] args) {
	
		Date date = new Date();
		int month = date.getMonth()+1;
		// month 만  +1을 해줘야 한다.
		System.out.print(month + "월 ");
				
		switch (month) {
		case 4:	case 6:	case 9:	case 11:  //한줄 표기 가능하다 ( 4,6,9,11 인 경우 )
			System.out.println("30일까지");
			break;
		case 2:
			System.out.println("28일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}
}