/*
 * 1.��ǻ�Ͱ� 1~9�� ���δٸ� �� �� �����ϴ� ����
 * 2.����ڰ� 1~9�� ���� 3�� �Է��ϱ�
 * 3.��ǻ�Ϳ� ������� ���ڸ� ���ϴ� ����(����, ����)
 * 4.��� ��Ÿ����(������ ���ڰ� ������ ��Ʈ����ũ, ���ڸ� ������ ��, �Ѵ� �ƴϸ� �ƿ�)
 * 5.9�� �õ��� �� �ְ� ������
 */
package white;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baseball {
	
	
	ArrayList<Integer> computerRandumNumbers() {

		ArrayList<Integer> computerNumber = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++) {
		computerNumber.add(i);
		}
		
		Collections.shuffle(computerNumber);
		return computerNumber;
	}

	int userNumberInput() {
		
		System.out.println("Input your number treetime from 1~9");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	ArrayList<Integer> userNumberChange(int number) {
		int a = number / 100, b = ( number % 100 ) / 10, c = ( number % 100 ) % 10;
		ArrayList<Integer> userNumber = new ArrayList<Integer>();
		userNumber.add(a); userNumber.add(b); userNumber.add(c);
		return userNumber;
	}
	
	String compareNumbers() {
		
		return null;
	}
	
	public static void main(String[] args) {
		Baseball bb = new Baseball();
		int number = bb.userNumberInput();
		System.out.println(
				"Computer Random Number : " +
				bb.computerRandumNumbers().get(0) + " " +
				bb.computerRandumNumbers().get(1) + " " +
				bb.computerRandumNumbers().get(2)
				);		
		System.out.println(
				"User Number : " +
				bb.userNumberChange(number).get(0) + " " +
				bb.userNumberChange(number).get(1) + " " +
				bb.userNumberChange(number).get(2)
				);
	}
	
	
	
}
