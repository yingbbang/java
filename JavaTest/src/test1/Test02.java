package test1;
import java.util.Scanner;

/* 
 * 날짜 : 2025/07/09 10:37
 * 이름 : 조지영
 * 내용 : (문제2) 자바 기본 입출력 연습문제
 */ 
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int		year;
		int		birth;
		String	name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt(); // 정수 입력받기
				 
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt(); // 정수 입력받기
				
		System.out.print("이름 입력 : ");
		name = sc.nextLine(); // 문자열 한 줄 입력받기
				
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
		
	}
}


