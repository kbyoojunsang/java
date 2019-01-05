package window2;

public class Dog {

	// 2. 정적 특징(상태) => 변수로 만든다
	// : 강아지 경우 (털이있음, 다리 4개 등)
	boolean tail;
	int leg;

	// 3. 동적 특징(동작) => 함수(메소드)
	// : 강아지 경우 (멍멍짖음, 꼬리를 흔듬 등)
	public void bark() {
		System.out.println("멍!멍!");
	}

	public void shake() {
		System.out.println("꼬리를 막 흔든다!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
