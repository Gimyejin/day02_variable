package day02_variable;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String age;
		String name;
		System.out.println("�̸��Է�: ");
		name = input.next();//�̸��� �Է¹޴��ڵ�
		System.out.println("�����Է�: ");
		age = input.next();//���̸� �Է¹޴��ڵ�
		
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		
	}

}
