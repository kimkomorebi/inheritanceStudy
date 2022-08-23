package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Tiger {
	Tiger(){}
	int age = 10;
	void doIt() {
		System.out.println("Tiger");
	}
}
class Lion {
	Lion(){}
	static int age = 10;
	static void doIt() {
		System.out.println("Lion");
	}
}
interface Fish {
	int SPEED = 50; //상수
	void swim();//추상 메서드
}
interface Bird {
	static final int SPEED = 100;//상수
	public abstract void fly(); //추상 메서드
	//상속해서 오버라이드 해야 하므로 public(공개)으로만 가능
	
	//자바에서 은닉에 단계(4단계)
	//1. 완전 공개(은닉을 안 한다) : public
	//-> 서로 다른 패키지에서도 접근할 수 있다.
	//2. 같은 패키지 안에서만 공개 : 아무것도 안 쓴다.(기본) default
	//-> 
	//3. 자식에게만 공개 : protected
	//4. 완전 은닉(같은 클래스 안에서만 공개) : private
	//			클래스에는 public과 기본만 된다
	//			public class A {} 가능
	//			class B {} 가능
	//			protected class C {} 클래스엔 오류 //변수, 메서드만 가능
	//			private class D {} 클래스엔 오류  //변수, 메서드만 가능
}
interface Animal extends Bird, Fish {
	
}
class Somebody implements Bird, Fish {
	@Override
	public void swim() {

	}
	@Override
	public void fly() {

	}
}
class Cat {
	Cat(){}
	final int SPEED = 100;
}
@WebServlet("/Aug23Study")
public class Aug23Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int y = Bird.SPEED;
		Cat c1 = new Cat();
		int x = c1.SPEED;
		
		Tiger t = new Tiger();//인스턴스 생성(홍길동)
		int a = t.age;
		t.doIt();
		Tiger t2 = new Tiger();//인스턴스 생성(박길동)
		t2.doIt();
		Tiger t3 = new Tiger();//인스턴스 생성(최길동)
		t3.doIt();
		
		int b = Lion.age;
		Lion.doIt();
	}
	private static final long serialVersionUID = 1L;

    public Aug23Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
