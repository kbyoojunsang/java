package window2;

public class TV {
	// main 사용체크 안함 , 부품으로 쓰니깐
	// 정적 특징(상태) -> 변수
	// └ 모양, 받침대가 있음
	String shape;
	boolean stand;

	// 동적 특징(동작) -> 메소드
	// └ 채널변경하다, TV켜다.
	public void change(int ch) {
		System.out.println("번호로 채널 변경하다.");
	}

	public void turnOn() {
		System.out.println("TV를 켜다.");
	}
}