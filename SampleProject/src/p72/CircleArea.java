package p72;
/*
 * 날짜 : 2025/07/08 18:21
 * 이름 : 조지영
 * 내용 : 변수, 리터럴, 상수 활용
 */
public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언
		
		double radius = 10.0; // 원의 반지름
		double circleArea = radius*radius*PI; // 원의 면적 계산
		
		// 원의 면적을 화면에 출력한다.
		System.out.println("원의 면적 = " + circleArea);
	}
}
