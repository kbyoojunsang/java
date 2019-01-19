package Inherit;

public class Person {
	// 정적특징 - 이름(변수로 나타냄), 나이 (변수로 나타냄)
	String name;
	int age;
	// 동적특징 - 걷다.(매소드 함수), 웃다.(매소드 함수)
	public void walk() {  /* 돌려주는게 없을때 void 사용 */
		System.out.println("걷다.");
	}
	public void smile() {
		System.out.println("웃다.");
	}
}
