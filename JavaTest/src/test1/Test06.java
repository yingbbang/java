package test1;

import java.util.Scanner;

/* 
 * 날짜 : 2025/07/09 11:13
 * 이름 : 조지영
 * 내용 : (문제6) 자바 삼항 연산자 연습문제 
 */ 
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
	}

}
