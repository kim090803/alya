import java.util.*;
public class Main {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); // 총 몇 개의 숫자를 입력받을 것인지(배열의 크기)를 나타내는 수 N을 입력받는다
	int[] arr = new int[N]; // 입력받은 N의 크기만큼 빈 공간을 가진 정수형 배열 arr을 만든다

	for(int i = 0; i<N; i++) { 
		arr[i] = sc.nextInt();	
	} // N번 반복하면서 숫자를 입력받고 만든 배열 arr의 0번 칸부터 집어넣는다
	int V = sc.nextInt(); // 배열을 다 채운 후 마지막으로 주어지는 우리가 찾아야 할 숫자를 V에 저장합니다
	int count = 0; // V와 똑같은 숫자가 몇 개인지 세어줄 변수 처음엔 센 것이 없으니 0으로 시작
	for(int j = 0; j<N; j++) { // 배열의 0번 칸부터 마지막 칸(N-1번 칸)까지 하나씩 꺼내보기 위해 다시 반복문을 돌린다
		if(arr[j] == V) {
			count++;
			}
		// 배열의 j번째 칸에 들어있는 숫자(arr[j]가 우리가 찾는 숫자(V)와 똑같은지 비교하고 똑같다면 count를 1증가 한다(count++는 count = count +1)
	}
	System.out.println(count); // 최종 출력
		}
	}