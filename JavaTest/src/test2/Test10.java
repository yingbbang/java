package test2;

/* 
 * 날짜 : 2025/07/10 09:24
 * 이름 : 조지영
 * 내용 : (문제10) 자바 피보나치 수열 재귀 메서드 연습문제
 */
public class Test10 {
	public static void main(String[] args) {

		for(int i=0; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo( n-1 ) + fibo( n-2 );
		
	}
}
