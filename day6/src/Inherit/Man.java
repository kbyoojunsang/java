package Inherit;

public class Man extends Person { /* 확장해서 사용하겠다. 동적특징, 정적특징 갖고 시작함. */
	/* 기존 Person 에 정의한 특징에다가, 정적동적 특징 추가하기 */
	// 정적특징 - speed
	int speed;
	// 동적특징 - run
	public void run() {
		System.out.println("달리다.");
	}

}
