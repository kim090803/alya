import java.util.*;
public class Main {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(); // 앞으로 입력받을 숫자가 총 몇개인지를 나타내는 변수 a를 입력받습니다
	int b = sc.nextInt(); // 기준이 되는 숫자 b를 입력받는다
	
	for(int i = 0; i < a; i++) { // i가 0부터 시작해서 a보다 작을 때까지(즉, 딱 a번)반복문을 실행
		int num = sc.nextInt(); // 반복문이 돌 때마다 새로운 숫자를 하나씩 입력받아 num이라는 변수에 저장
	if(num < b)	{ // 방금 입력받은 숫자(num)가 기준 숫자(b)보다 작은지 비교합니다
		System.out.print(num); // 조건에 맞아 떨어지면(작다면) 그 숫자를 화면에 출력하고, 바로 뒤에 띄어쓰기 한 칸을 덧붙인다
		System.out.print(" ");
			}
		}
	}
}