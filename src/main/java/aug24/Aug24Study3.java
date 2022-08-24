package aug24;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//전자제품 공장에서 국내용(220V)과 수출용(110V)을 제작한다.
class Product {
	Voltage v;
	void useVotage() { v.useVoltage(); }
}//제품

interface Voltage {
	void useVoltage();
}//내수와 수출의 차이

class ForKorea implements Voltage {
	public void useVoltage() {System.out.println("220V");}
}
class ForUSA implements Voltage {
	public void useVoltage() {System.out.println("110V");}
}
class ProductForKorea extends Product {
	ProductForKorea(){ v = new ForKorea(); }
}
class ProductForUSA extends Product {
	ProductForUSA(){ v = new ForUSA(); }
}

@WebServlet("/Aug24Study3")
public class Aug24Study3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductForKorea p1 = new ProductForKorea();
		ProductForKorea p2 = new ProductForKorea();
		p1.useVotage(); p2.useVotage();
		ProductForUSA p3 = new ProductForUSA();
		p3.useVotage();
	}
	private static final long serialVersionUID = 1L;
    public Aug24Study3() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
