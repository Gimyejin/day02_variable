package day02_variable;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		int val;
		System.out.println("�Է�: ");
		val = System.in.read();
		System.out.println("�Է� data: "+(char)val);
		
		System.in.read();	//�� �ΰ��� �߰��ؾ� ���� �� ���� �� ����
		System.in.read();	//�̷��� �ؾ� ���� �ܿ����� �о
		
		
		System.out.println("2��° �Է�: ");
		val = System.in.read();
			//���ۿ� �̹� ���Ͱ� ������
			//���Ͱ��� ���ؼ� ����ڰ� �Է��� ���ߴٰ� �Ǵ��ؼ� ÷�� �Է��� ���� ������
			//���� �ܿ����� ����
		System.out.println("�Է� data: "+(char)val);
	}

}
