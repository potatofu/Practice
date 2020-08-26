import java.util.*;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별의 층을 몇개 만들지 숫자를 입력해주세요: ");
		int input = scanner.nextInt();
		
		
		for(int i = 1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
