package control;
import java.util.Date;
import java.util.Scanner;
public class SwitchTest3 {
	public static void main(String[] args) {
	
		Date date = new Date();

		int year = date.getYear();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		System.out.print((year+1900) + "년 ");
		System.out.print(hour + "시 ");
		System.out.print(min + "분 ");
		System.out.println(sec + "초 ");
		
		int mon = date.getMonth()+1;
		// month 만  +1을 해줘야 한다.
		int day = date.getDay();
		
		System.out.print(mon + "월 ");
				
		switch (day) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			break;  
		}	
		
		
		switch (mon) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("봄");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("여름");
			break;
		case 5:
			System.out.println("여름");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("가을");
			break;
		case 8:
			System.out.println("가을");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("겨울");
			break;
		case 11:
			System.out.println("겨울");
			break;
		case 12:
			System.out.println("겨울");
			break;

		default:
			break;
		}
		
		
	}
}			

		
		
