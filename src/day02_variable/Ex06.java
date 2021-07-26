package day02_variable;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		int val;
		System.out.println("입력: ");
		val = System.in.read();
		System.out.println("입력 data: "+(char)val);
		
		System.in.read();	//이 두개를 추가해야 넣은 걸 읽을 수 잇음
		System.in.read();	//이렇게 해야 엔터 잔여물을 털어냄
		
		
		System.out.println("2번째 입력: ");
		val = System.in.read();
			//버퍼에 이미 엔터가 존재함
			//엔터값에 의해서 사용자가 입력을 다했다고 판단해서 첨에 입력한 값을 돌려줌
			//엔터 잔여물이 문제
		System.out.println("입력 data: "+(char)val);
	}

}
