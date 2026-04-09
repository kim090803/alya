import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 행 n 행 m 입력받
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // A행렬 저장하는 2차원 배열을 생성
        int[][] a = new int[n][m];
        
        // A 행렬을 입력 한 것
        // i 행, j = 열
        for(int i = 0; i < n; i++) { // n줄 반복(행)
            for(int j = 0; j < m; j++) { // m개 반복(열)
                a[i][j] = sc .nextInt(); // a[i][j] 값 입력
            }
        }
        //B 행렬 입력과 동시에 덧셈을 처리해서 출력
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                
                // B 값 입력받자마자 a랑 더하는 것
                int sum = a[i][j] + sc.nextInt();
                System.out.print(sum + " ");

            }
            
        }
    }
}
