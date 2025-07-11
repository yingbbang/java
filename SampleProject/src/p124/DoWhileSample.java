package p124;
/* 
 * 날짜 : 2025/07/09 12:38
 * 이름 : 조지영
 * 내용 : a부터 z까지 출력
 */
public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1); // 영문의 경우 1을 더하면 다음 문자의 코드 값
		
		} while (c <= 'z');
	}
}
