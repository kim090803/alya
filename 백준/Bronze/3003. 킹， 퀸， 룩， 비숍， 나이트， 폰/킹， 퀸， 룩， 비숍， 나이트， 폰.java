import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {1,1,2,2,2,8}; // 정답 개수
		int [] c = new int[6]; // 입력한 값 저장 배열
		for(int i = 0; i < 6; i++) { // 킹 ~ 폰 순서
			c[i] = sc.nextInt(); // 하나씩 입력을 받아서 배열에 저장
		}
		for(int j = 0; j < 6; j++) { // 정답 - 입력값 계산해서 출력
			// a[i] 원래 가지고 있어야 하는 개수
			// c[i] 현재 가지고 있는 개수
			
			System.out.print(a[j] - c[j] + " ");
			// 차이를 출력 
		}

	}
}