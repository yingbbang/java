package test1;

/* 
 * 날짜 : 2025/07/09 10:44
 * 이름 : 조지영
 * 내용 : (문제3) 자바 연산자 연습문제
 */ 
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
