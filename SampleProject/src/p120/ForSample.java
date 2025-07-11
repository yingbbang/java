package p120;

/* 
 * 날짜 : 2025/07/09 12:24
 * 이름 : 조지영
 * 내용 : for 문을 이용하여 1에서 10까지의 합 출력
 */
public class ForSample {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i); //더하는 수 출력
			if(i<=9) // 1~9까지는 '+' 출력
				System.out.print("+");
			else { // i가 10인 경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력				
			}
		}
	}
}
