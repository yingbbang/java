package sub1;


/*
 * 날짜 : 2025/07/08 09:00
 * 이름 : 조지영
 * 내용 : 자바 조건문 실습하기
 */
public class IfTest {

	public static void main(String[] args) {
		
		// if 문 연습 (조건이 맞으면 실행함)
		int num1 = 1;
		int num2 = 2;
	
		// 만약 num1이 num2보다 작으면
		if(num1 < num2) {
					// 조건이 참일때 실행
			System.out.println("num1이 num2보다 작다.");
		}
		
		
		// 만약 num1이 1보다 크면 (하지만 지금은 1이라서 실행되지 않음)
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
		}
		
		// 조건을 if 안에 또 if로 넣을 수 있음 (중첩 if문)
		if(num1 > 0) { // num1이 0보다 크면 (참)
			
			if(num2 > 1) { // 그리고 num2가 1보다 크면 (참)
				System.out.println("num1은 0보다 크고,num2는 1보다 크다.");
			}
		}
		
		// 위와 같은 내용을 한 줄에 조건 2개를 넣어서도 가능
		if(num1 > 0 && num2 > 1) {
			// &&는 '그리고' 라는 뜻 (둘 다 참일 때만 실행됨)
			System.out.println("num1은 0보다 크고 그리고 num2은 1보다 크다.");
		}
		
		// if ~ else 문 연습 (참이면 if, 아니면 else 실행)	
		int var1 = 1, var2 = 2;
		
		if(var1 > var2) {
			// var1이 var2보다 크면 이 문장 실행(조건이 참일때)
			System.out.println("var1은 var2보다 크다.");
			
		}else {
			// 그렇지 않으면 이 문장 실행(조건이 거짓일 때)
			System.out.println("var1은 var2보다 작다.");		
		}

		// if ~ else if ~ else 문 연습 (여러 조건을 순서대로 검사함)
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			// n1이 n2보다 크면 이 문장 실행
			System.out.println("n1은 n2보다 크다.");
		
		}else if(n2 > n3) {
			// n1이 n2보다 크지 않고, n2가 n3보다 크면 이 문장 실행 
			System.out.println("n2은 n3보다 크다.");
			
		}else if(n3 > n4) {
			// 위에 둘 다 아니고, n3가 n4보다 크면 이 문장 실행
			System.out.println("n3은 n4보다 크다.");
		
		}else {
			// 위 조건이 모두 거짓이면 이 문장 실행
			System.out.println("n4가 제일 크다.");
		}
		
	}
}
