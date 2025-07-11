package step1;

import java.util.Scanner;

/*  날짜: 2025/07/10 11:00
	
	문제
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	출력
	첫째 줄에 A+B를 출력한다.
 */
public class Main02 {
	
	public static void main (String[] args) { // 제출할 때는 반드시 Main 클래스 이름으로 제출
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println("a : " + a);
		//System.out.println("b : " + b);

		System.out.println(a+b);
	
	
	}

}
