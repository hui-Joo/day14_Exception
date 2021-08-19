package day14_Exception;

import java.io.IOException;
class A {
	public void test() {
		ProcessBuilder b = new ProcessBuilder("calc111");
		try {
			b.start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void display(){
		test();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		System.out.println("다음 문장들 실행");

	}

}
// 예외 전가를 가져가 썼는데 그 곳이 전가가 필요한 곳이라면 전가를 지속해야함(예외전가 물려받음/불편함)