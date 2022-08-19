package aug19;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//자바백화점이 있습니다. 
//자바백화점에 가방이 있습니다. 
//가방의 가격은 난수(5~10) 자바백화점에 신발이 있습니다. 
//신발의 가격은 난수(5~10) 자바백화점에 시계가 있습니다. 
//시계의 가격은 난수(5~10) 자바백화점에 요시다 판매원이 있습니다. 
//요시다가 가방을 팔았습니다. 요시다가 신발을 팔았습니다. 
//요시다가 시계를 팔았습니다. 요시다가 판매한 모든 물품의 합을 출력합니다.

class JavaDepartmentstore {
	JavaDepartmentstore(){}
	int price = 0;
}

class Bag extends JavaDepartmentstore {
	Bag(){
		price = (int)(Math.random() * 6 +5);
	}
}
class Shoes extends JavaDepartmentstore {
	Shoes(){
		price = (int)(Math.random() * 6 +5);
	}
}
class Clock extends JavaDepartmentstore {
	Clock(){
		price = (int)(Math.random() * 6 +5);
	}
}
class Yoshida {
	Yoshida(){}
	int total = 0;
	void sell(JavaDepartmentstore s) {
		total = total + s.price;
	}
//	void sell(Bag b) {
//		total = total + b.price;
//	}
//	void sell(Shoes s) {
//		total = total + s.price;
//	}
//	void sell(Clock c) {
//		total = total + c.price;
//	}
//	void sellAll(Bag b, Shoes s, Clock c) {
//		total = b.price + s.price + c.price;
//	}
}
@WebServlet("/Quiz")
public class Quiz extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bag b = new Bag();
		Shoes s = new Shoes();
		Clock c = new Clock();
		Yoshida y = new Yoshida();
		System.out.println("가방의 가격:"+b.price);
		System.out.println("신발의 가격:"+s.price);
		System.out.println("시계의 가격:"+c.price);
		y.sell(b);//JavaDepartmentstore b = new Bag();
		y.sell(s);//JavaDepartmentstore s = new Shoes();
		y.sell(c);//JavaDepartmentstore c - new Clock();
		System.out.println("총 판매 가격:"+y.total);
//		y.sellAll(b, s, c);
//		System.out.println("총 판매 가격:"+y.total);
	}
	private static final long serialVersionUID = 1L;
       

    public Quiz() {
        super();
    }




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
