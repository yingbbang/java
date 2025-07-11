package test2;
/* 
 * 날짜 : 2025/07/10 09:07
 * 이름 : 조지영
 * 내용 : (문제1) 자바 배열 문자 출력 연습문제
 */ 
public class Test01 { // Test01이라는 이름의 클래스(코드 상자)를 시작합니다.
	
	public static void	main(String[] args) { // 프로그램의 시작점인 main 메서드입니다. 
		
		// 글자 10개를 배열로 지정합니다. 'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		
		// 행(row)과 열(col)이라는 이름의 숫자 변수를 미리 선언해 둡니다.
		int row, col;
		
		// row 값을 1부터 9까지 반복합니다. (총 9줄을 출력합니다.)
		for (row = 1; row < 10; row++) {
			
			// col 값을 0부터 row 까지 반복하면서 글자를 출력합니다.
			for (col = 0; col <= row; col++) {
				
				// 배열 str의 col 번째 글자를 출력합니다. 줄바꿈 없이 이어서 출력합니다.
				System.out.print(str[col]);
						
			}
			
			// 한 줄의 출력이 끝나면 줄바꿈을 합니다.
			System.out.print("\n");
		}
		
	} // main 메서드 끝
	
} // 클래스 끝
