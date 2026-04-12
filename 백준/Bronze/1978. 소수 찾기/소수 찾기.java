import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 기준이 되는 숫자 입력 
    int count = 0;       // 소수의 개수 측정
    for(int i = 0; i<N; i++) {    // i를 N 만큼 반복 한 마디로 (N = 4 == i = 4개의 숫자)
        int num  = sc.nextInt(); // 아무 숫자나 하나씩 입력받음(N 만큼)
        boolean a = true; // 소수 인지 아닌지 판별하기 위해 만듬(처음은 true)
        if (num >= 2) {  // 입력 받은 숫자가 2 이상만 계산(1은 소수가 아님)
            for(int j = 2; j < num; j++) { // 2부터 num 전 까지만 나누기)
                
    // 예시: num = 7 num(7) % 2 = 소수 ... num(7) % 6 = 소수  num(7) % 7 = 소수 X
                
                if(num % j == 0) {
                    a = false;
                    break;
                    // 나눴을 떄 0 이 나온다면 소수가 아님
                    // 그러므로 a를 false(소수가 아님)로 만들고 이 for문을 나감(break)
                }
            } if (a == true) {
                count++;
                // 아직도 a가 true 인 애들의 개수 만큼 count(소수 개수)를 1증가
            }
        }
    }
    System.out.println(count);
    // 소수 개수 출력
    }
} 