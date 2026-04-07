import java.util.*;
public class Main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	// 2차원 배열은 잘 모르기 떄문에 AI를 많이 활용했음
	int N = sc.nextInt(); // 첫 번쨰로 입력된 숫자를 가져와 행렬의 세로 길이(행의 개수) N으로 저장
	int M = sc.nextInt(); // 두 번쨰로 입력된 숫자를 가져와 행렬의 가로 길이(열의 개수) M으로 저장
	int [][] arr1 = new int[N][M];	// N행 M열 크기의 첫 번째 빈 행렬(arr1)을 생성
	int [][] arr2 = new int[N][M];  // N행 M열 크기의 두 번째 빈 행렬(arr2)을 생성
	for (int i = 0; i<N; i++) {     // 바깥쪽 for문: 0번째 행부터 N-1번째 행까지 한 줄씩 밑으로 내려간다
		for(int j = 0; j<M; j++) {  // 안쪽 for문: 현재 행에서 0번째 열부터 N-1번째 열까지 오른쪽으로 이동 
			arr1[i][j] = sc.nextInt(); // 입력된 숫자를 하나씩 가져와서 arr1의 [ㅑ][ㅓ] 위치에 저장
		}
	} 
	for (int i = 0; i<N; i++) {    // 위 와 똑같은 방식으로 행을 순회
		for(int j = 0; j<M; j++) { // 열을 순회 
			arr2[i][j] = sc.nextInt(); // 이번에는 입력된 숫자들을 arr2의 [i][j] 위치에 저장
		}
	}
	for(int i = 0; i<N; i++) { // 출력을 위해 다시 N번을 반복하는 바깥쪽 for문을 연다
		for(int j =0; j<M; j++) { // M번은 반복하는 안쪽 for문을 연다
			System.out.print((arr1[i][j] + arr2[i][j]) + " "); // 같은 위치(i행 j열)에 있는 두 배열의 값을 더하고 뒤에 공백(" ")을 붙여서 옆으로 나란히 출력 (핵심: println이 아니라 print 사용)
		}
		// 안쪽 for문이 끝났다는 건 한 줄(행) 출력이 끝났다는 뜻 이므로
		// 다음 줄을 출력하기 전에 엔터(줄바꿈) 역할을 하는 println()을 실행
		System.out.println();
	}
		
	}
	
	
    }