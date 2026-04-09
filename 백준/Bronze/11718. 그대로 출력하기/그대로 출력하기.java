import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 100; i++) { // for문을 100번 까지만 반복 
			if(!sc.hasNextLine()) {
				break;
				// 읽을 다음 줄이 없다면 for문을 탈출해라(멈춰라)
			}
		String str = sc.nextLine(); // 문자열 값 입력 받기
		System.out.println(str); // 문자열 값 입력 받은걸 출력
		}
	}
}