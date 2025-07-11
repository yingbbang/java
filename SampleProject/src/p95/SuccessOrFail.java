package p95;
/*
 * 날짜 : 2025/07/08 17:20
 * 이름 : 조지영
 * 내용 : if문 활용
 */
import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		
	scanner.close();
		
	}
		
}
