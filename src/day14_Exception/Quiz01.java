package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 인증 프로그램 만들기
 90년생부터는 '가입불가
 90년생 미만은 '가입가능'
 A,ㅁ,ㅋ,구십년,... 이러한 값 입력시 '잘못입력 숫자입력' 문구 출력
 */

class Auth {
	private String age;
	public String getAge() { return age; }
	public boolean check(int age) {
		this.age = age + "";
		if(this.age.length() == 6) {
			if(this.age.charAt(0) < '9') {
				System.out.println("가입 가능");
				return true;
			}else {
				System.out.println("가입 불가");
			}
		}else {
			System.out.println("길이가 잘 못 됨");
		}
		return false;
	}
	public int inputAge() {
	Scanner input = new Scanner(System.in);
	int age;
	String checkAge;
	System.out.println("나이 입력 : ");
	try {
	age = input.nextInt();
	return age;
	}catch(InputMismatchException e) {
		System.out.println("숫자를 입력 하세요!");
		return -1;
	}
	}
	public void display() {
		boolean bool = false;
		System.out.println("인증 프로그램 입니다.");
		int age = -1;
		while(bool != true) {
			age = inputAge();
			if(age != -1)
				bool = check(age);
		}
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Auth au = new Auth();
		au.display();
	}
}
