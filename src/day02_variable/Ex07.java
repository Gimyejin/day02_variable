package day02_variable;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String age;
		String name;
		System.out.println("이름입력: ");
		name = input.next();//이름을 입력받는코드
		System.out.println("나이입력: ");
		age = input.next();//나이를 입력받는코드
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
	}

}
