package aug12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
class A {A(){ 
	System.out.println("A");
	int r = (int)(Math.random() *10 + 1);
	}
}
class B extends A { 
	B(){ 
		super();//super 생성자
		System.out.println("B");
		}
	}
class C extends B { 
	C(){
			super();//super 생성자
			System.out.println("C");
		}
	}
class D extends C { 
	D(){ 
			super();//super 생성자 : 부모의 생성자를 호출하는 것 // 입력 안 할 시 자바 컴파일러가 자동으로 삽입
			System.out.println("D");
		}
	}
@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Test2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		D d = new D(); //class를 데이터로 바꾸는 것 instance
		//D의 조상이 전부 instance로 바뀌어야 함
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
