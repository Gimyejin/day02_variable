package day02_variable;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("ù��° �� �Է�");
		n1 = input.next();//�̰� ������ �����ڷ� �� aaa bbb �� ġ�� �ر��� �Ȱ��� �ٷ� ��µ�
		//nextLine�� ���Ͱ��� ������
		System.out.println("�ι�° �� �Է�");
		n2 = input.next();
		System.out.println("ù��° ��: "+n1);
		System.out.println("�ι�° ��: "+n2);
	}

}