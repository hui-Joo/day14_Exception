package day14_Exception;
class BBB{
	public int aaa;
}
class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("오브젝트 : " +a);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		//자식은 부모형태(부모클래스에 저장 가능)로 저장 할 수 있다.
		Object ss = "test";
		a.catch1(11);
		a.catch1("aaa");
		a.catch1(1.111);
		a.catch1('a');
		
	}
}
