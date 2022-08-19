package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//TV, 컴퓨터, 냉장고가 있습니다. 가격(십만, 삼십만, 이십만)이 있습니다.
//스즈키가 용돈을 백만원 가지고 있습니다.
//스즈키가 용돈으로 TV, 컴퓨터, 냉장고를 구매했습니다.
//구매(메소드) : 스즈키의 용돈 - TV의 가격
//구매(메소드) : 스즈키의 용돈 - 컴퓨터의 가격
//구매(메소드) : 스즈키의 용돈 - 냉장고의 가격
//스즈키의 용돈 잔액을 출력합니다.

class Suzuki {
	void buy(Item a) {
		pocketMoney = pocketMoney - a.price;
	}
//	void buy(TV a) {//TV를 구매하는 메소드
//		pocketMoney = pocketMoney - a.price;
//	}
//	void buy(Computer b) {
//		pocketMoney = pocketMoney - b.price;
//	}//컴퓨터를 구매하는 메소드
//	void buy(Ref c) {
//		pocketMoney = pocketMoney - c.price;
//	}//냉장고를 구매하는 메소드
	
	int pocketMoney = 1000000;
	Suzuki(){}
}
class Item {
	int price;
	Item(){}
}
class TV extends Item {
	TV(){
		price = 100000;
	}
}
class Computer extends Item {
	Computer(){
		price = 300000;
	}
}
class Ref extends Item {
	Ref(){
		price = 200000;
	}
}


@WebServlet("/Aug18Study2")
public class Aug18Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TV tv = new TV();
		Computer com = new Computer();
		Ref rf = new Ref();
		Suzuki su = new Suzuki();
		System.out.println("구매하기 전 스즈키의 용돈:"+su.pocketMoney);
		su.buy(tv);//TV를 구매함
		su.buy(com);//컴퓨터를 구매함
		su.buy(rf);//냉장고를 구매함
//		위의 su.buy();  tv,com,rf 변수 안에 각 클래스가 담겨있고 
//		buy 메서드의 매개변수 데이터타입으로 item을 작성하여
//		price 변수에 접근
//		Item a = new TV();
//		a = new Computer();
//		a = new Ref();
		
		System.out.println("TV의 가격:"+tv.price);
		System.out.println("컴퓨터의 가격:"+com.price);
		System.out.println("냉장고의 가격:"+rf.price);
		System.out.println("스즈키의 용돈:"+su.pocketMoney);
		
	}
	private static final long serialVersionUID = 1L;

    public Aug18Study2() {
        super();

    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
