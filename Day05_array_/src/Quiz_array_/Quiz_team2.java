package Quiz_array_;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		����) 1
//
//		���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
//	
//		1+1+1+1
//		1+1+2
//		1+2+1
//		2+1+1
//		2+2
//		1+3
//		3+1
//		���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.
//	
//		���
//		�� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		//�ϴ� �ѱ�
		
//		����) 2
//
//		�迭�� ����� ����� �հ� �ִ밪�� ���ϼ���
//
		int arr[] = new int [] {12, 56, 23, 39};
		int sum = 0, max = 0;
		
		for (int a : arr) {
			sum += a;
			if (max < a) {
				max = a;
			}
		}
		System.out.println("�� : " + sum);
		System.out.println("�ִ� : " + max);
		
//		����) 3
//
//		���� 5���� �Է¹޾� ���� ������� �����ϼ���
		
		int numb[] = new int[5];
		int vsnum = 0, index = 0, n_index = 0;
		boolean bool = true;
		
		System.out.print("�� �Է� : ");
		int n = input.nextInt();
		vsnum = n;
		
		for (int i = 1 ; i < numb.length ; i++) {
			System.out.print("�� �Է� : ");
			n = input.nextInt();
//			while(bool) {
				
			if (n > vsnum) {
				n_index = index;
				index = i;
			}
				
//			}
		}
		
	}

}