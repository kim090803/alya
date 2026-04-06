import java.util.*;
public class Main {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int[] Students = new int[31]; // 31개의 칸(0번~30번)을 가진 정수형 배열을 만듬
	for(int i = 0; i<28; i++) { // 과제를 제출한 학생이 28명 이므로 입력을 딱 28번만 받기 위해 반복
		int a = sc.nextInt(); // 제출한 학생의 출석 번호를 입력받아 변수 a에 저장
		Students[a] = 1; // 입력받은 학생 번호(a)에 해당하는 배열의 칸에 1을 넣는다(이유: 처음 배열을 만들 때 모두 0으로 되어 있으니 제출한 학생의 번호만 1로)
		
	} for(int j = 1; j <= 30; j++) { // 1번 학생부터 30번 학생까지 순서대로 검사하기 위해 반복문을 1부터 30까지 돌림(0번 인덱스는 안쓰니까 1부터 시작)
		if(Students[j] == 0) { 
			System.out.println(j); 
			// j번째 학생의 배열 값이 0인지 확인하고 0 이라면 그 번호(j)를 출력
			// 이유: 앞선 과정에서 제출한 학생은 모두 1로 바뀌었으므로 여전히 값이 0인 칸의 인덱스 번호가 바로 과제를 내지 않는 학생의 번호가 되기 떄문
		}
	}
	sc.close();
		}
	}