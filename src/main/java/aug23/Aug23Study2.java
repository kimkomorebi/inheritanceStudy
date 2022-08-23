package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//페가수스 객체 설계(날개가 있는 말 : 새의 특징과 말의 특징을 모두 소유)
//새의 특징과 말의 특징을 각각 인터페이스로 설계
interface Birdd {
	void fly(); // 새의 난다는 메서드 (추상메서드)
}//새의 특징을 갖는 객체
class Sparrow implements Birdd {
	@Override
	public void fly() {
		System.out.println("날개를 빠르게 움직이며 난다.");
	}
}
class Eagle implements Birdd {
	@Override
	public void fly() {
		System.out.println("천천히 멋있게 난다.");
	}
	
}
interface Horse {
	void run();//말의 뛰어다니는 메서드(추상메서드)
}//말의 특징을 갖는 객체

@WebServlet("/Aug23Study2")
public class Aug23Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	private static final long serialVersionUID = 1L;
       

    public Aug23Study2() {
        super();
    }




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
