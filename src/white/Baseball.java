/*
 * 1.컴퓨터가 1~9중 서로다른 수 를 선택하는 로직
 * 2.사용자가 1~9중 숫자 3개 입력하기
 * 3.컴퓨터와 사용자의 숫자를 비교하는 로직(순서, 숫자)
 * 4.결과 나타내기(순서와 숫자가 맞으면 스트라이크, 숫자만 맞으면 볼, 둘다 아니면 아웃)
 * 5.9번 시도할 수 있게 해주자
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
