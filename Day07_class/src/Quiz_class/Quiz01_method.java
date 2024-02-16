package Quiz_class;

import java.util.Scanner;

public class Quiz01_method {
	public int scanF() { //수를 스캔하는 함수
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.print("수 입력 : ");
		n = input.nextInt();
		
		return n;
	}
	public int q1_calF(int n1, int n2) { //큰 수를 찾는 연산함수 
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
	public void int_printF(int n) { //출력 함수
		System.out.println(n);
	}
	public String q2_calF(int n) {
		if (n % 2 == 0)	{
			return "짝수";
		}
		else
			return "홀수";
	}
	public void str_printF(String s) { //출력 함수
		System.out.println(s);
	}
	public void q3_calF(int n) {
		if (n % 3 == 0)
			System.out.println(n);
	}
	public String q4_calF(int n) {
		int j = 0;
		for (int i = 1 ; i <= n ; i++) {

			if (n % i == 0) {
				j += 1;
			}
		}
		if (j == 2)
			return "소수 입니다.";
		else
			return "소수가 아닙니다.";
		
	}
	public int q5_calF(int n) {
		if (n < 0) {
			return -n;
		}
		else
			return n;
	}
	public int q6_calF(int n) { //수정 필요
		int num1 = 0 , num2 = 0;
		boolean bool = true;
		
		while (bool) {
			if (n >= 10) {
				num1 = n % 10 ; // 105 => 5 * 10 => 50 
				n = n / 10; //원래 수 n을 10으로 나눔 100-> 10
				num2 = num2 * 10 + num1 ; // num2를 *10한 뒤 num1을 더하여 하여 저장
			}
			else {
				num2 = num2 * 10 + n; 
				bool = false;
			}
		} 
		 return num2;
		
		
	}
}












































