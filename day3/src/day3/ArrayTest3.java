package day3;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] n = { 100, 200, 300 }; // 변수 3개 만들어짐, 단점 사이즈 조절 불가
		System.out.println(n[0]);
		System.out.println(n.length);

		// 시력 3개 만들고, 시력 3개 다 한번에 출력
		double[] eye = { 0.8, 1.0, 2.0 };
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}

		// foreach 바로 위에 것을 간단하게 요약
		for (double d : eye) {
			System.out.println(d);
		}

		// 친구 3명을 배열에 넣고 프린트
		String[] names = { "친구1", "친구2", "친구3" }; // String 첫글자는 반드시 대문자!!!
		// String 은 꼭 " " 큰 따옴표 쓴다.
		// char 는 꼭 ' ' 작은 따옴표 쓴다.
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println(names);
		// Ctrl + Shift + "F" 자동 들여쓰기 단축키 !!!!

		int[] num = new int[100];
		num[0] = 100;
		num[54] = 200;
		num[99] = 300;
		System.out.println(num[0] + " " + num[54] + " " + num[99] + " ");
		
		String[] subject = new String[100];
		subject[0] = "hello";
		subject[1] = "java";
		subject[99] = "spring";
		System.out.println(subject[0] + " " + subject[1] + " " + subject[99] + " ");
		System.out.println(subject.length);
		// ctrl + alt + 화살표 : 행복사
		// alt + 화살표 : 행이동
		
		
		
	}

}

