package day3;

public class ArrayTest2 {

	public static void main(String[] args) {
		String [] names = new String[5];
		names[0] = "김아무개";
		names[1] = "박아무개";
		names[2] = "송아무개";
		names[3] = "정아무개";
		names[4] = "이아무개";

		System.out.println(names.length);
		System.out.println(names[names.length-1]);

		// 시력 3개 double형 타입  , 1st 시력,  마지막 시력 프린트해라
		double[] eye = new double[3];
		
		eye[0] = 1.5;
		eye[1] = 0.1;
		eye[2] = 0.5;
		
		System.out.println(eye[0]);
		System.out.println(eye.length);
		System.out.println(eye[eye.length-1]);
		
	}

}
