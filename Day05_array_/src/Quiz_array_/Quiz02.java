package Quiz_array_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;

		System.out.print("礎熱 �汝� 殮溘 : ");
		odd_even = input.next();

		switch (odd_even) {
		case "礎熱" :
			for (int a : arr) {
				if (a % 2 == 0) {
					System.out.println("礎熱 : " + a);
				}
			}
			break;

		case "�汝�" :
			for (int a : arr) {
				if (a % 2 == 1) {
					System.out.println("�汝� : " + a);
				}
			}
			break;

		}



	}

}
