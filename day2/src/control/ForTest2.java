package control;

public class ForTest2 {

	public static void main(String[] args) {
		
		int mul =1;
		
		// 변수값
			//1) 넣지 않았을 때 (쓰레기값)
			//2) 초기값을 넣어줬을 때
			//3) 변경된 값이 들어갔을 때
		
		for (int i = 1; i <= 5; i++) {
			 mul = mul * i;
		           // 최초 sum 값은 0 
			}
		System.out.println( "20까지 곱은 "+ mul );
	}
}