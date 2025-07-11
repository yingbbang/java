package test1;
import java.util.Scanner;

/* 
 * 날짜 : 2025/07/09 11:07
 * 이름 : 조지영
 * 내용 : (문제5) 자바 조건문 연습문제 5
 */ 
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		switch(score / 10) {
		case 10:	 // 100점
		case 9:		 // 90~99점
			System.out.println("A 입니다.");
			break;
		case 8:		// 80~89점
			System.out.println("B 입니다.");
			break;
		case 7:		// 70~79점
			System.out.println("C 입니다.");
			break;
		case 6:		// 60~69점
			System.out.println("D 입니다.");
			break;
		default:	// 그 외 (0~59점)
			System.out.println("F 입니다.");
			break;	
		}
		
		sc.close();
	}

}
