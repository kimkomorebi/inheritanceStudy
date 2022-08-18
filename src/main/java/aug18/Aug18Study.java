package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//삼각형, 사각형, 원의 면적을 계산합니다.
//클래스를 찾는다.(SRP:Single Responsibility Principle)
// --> 단일 책임의 원칙
abstract class Dohyung {
	double size = 0;
	abstract void size();//면적을 계산하는 메소드
}//모든 도형 클래스의 조상

class Triangle extends Dohyung {//가로*세로 / 2
	int width = 10;
	int height = 20;
	
	Triangle(){}
	void size() {
		size = width * height / 2.0;
	}//면적을 계산하는 메소드
}//삼각형
class Rectangle extends Dohyung {//가로*세로
	int width = 5;
	int height = 15;

	Rectangle(){}
	void size() {
		size = width * height;
	}
}//사각형
class Circle extends Dohyung {//반지름*반지름*원주율
	int res = 8;

	Circle(){}
	void size() {
		size = res * res * 3.141592;
	}
}//원
@WebServlet("/Aug18Study")
public class Aug18Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dohyung s = new Triangle();//다형성
		s.size();//Triangle의 메소드
		System.out.println("삼각형의 면적:"+s.size);
		s = new Circle();//다형성
		s.size();//Circle의 메소드
		System.out.println("원의 면적:"+s.size);
		s = new Rectangle();
		s.size();//Rectangle의 메소드
		//s.size = (int)s.size;
		System.out.println("사각형의 면적:"+s.size);
		
//		Circle c = new Circle();
//		c.size();
//		System.out.println("원의 면적:"+c.size);
//		Rectangle r = new Rectangle();
//		r.size();
//		System.out.println("사각형의 면적:"+r.size);
//		Triangle t = new Triangle();
//		t.size();
//		System.out.println("삼각형의 면적:"+t.size);
		
	}
	private static final long serialVersionUID = 1L;

    public Aug18Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
