package day02_variable;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫번째 값 입력");
		n1 = input.next();//이건 공백을 구분자로 씀 aaa bbb 를 치면 밑까지 안가고 바로 출력됨
		//nextLine은 엔터값을 가져감
		System.out.println("두번째 값 입력");
		n2 = input.next();
		System.out.println("첫번째 값: "+n1);
		System.out.println("두번째 값: "+n2);
	}

}
