import java.util.*;
public class Main {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[9];
	int max=0;
	for(int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<arr.length; i++) {
		if(arr[i] > arr[max]) {
			max = i;
		}
	}
	System.out.println(arr[max]);
	System.out.println((max + 1));
	
	}
}