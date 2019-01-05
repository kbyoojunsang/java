package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		int mon = date.getMonth();
		int ill = date.getDate();
		
		System.out.println(hour + "시");
		System.out.println(hour + "분");
		System.out.println(hour + "초");
		
		System.out.println(mon + "월");
		System.out.println(ill + "일");
		
			}

	}


