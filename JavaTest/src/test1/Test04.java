package test1;

import java.util.Scanner;

/* 
 * 날짜 : 2025/07/09 10:49
 * 이름 : 조지영
 * 내용 : (문제4) 자바 조건문 연습문제 4
 */ 
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = 0; // 등급을 저장할 문자형 변수 선언
				
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		if(score >= 90 && score <= 100) { 
			grade = 'A'; // 90점 이상 A
		}else if(score >= 80 && score < 90) {
			grade = 'B'; // 80~89점 B
		}else if(score >= 70 && score < 80) {
			grade = 'C'; // 70~79점 C
		}else if(score >= 60 && score < 70) {
			grade = 'D'; // 60~69점 D
		}else{			
			grade = 'F'; // 59점 이하 F			
		}
		
		System.out.printf("등급은 %c입니다.", grade);
	}
}
