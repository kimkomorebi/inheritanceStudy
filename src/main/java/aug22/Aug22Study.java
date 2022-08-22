package aug22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//자바 백화점이 있습니다. 이 백화점에 가전 매장과 과일 매장이 있습니다.
class JavaDepartmentStore {
	JavaDepartmentStore(){
		em = new ElectroMart();
		 fm = new FruitMart();
	}
	Mart em;
	Mart fm;
}//자바 백화점
abstract class Mart {
	//추상 클래스는 생성자가 필요 없다. 인스턴스 하지 않기 때문에!
	Product item1;
	Product item2;
//	Product sb;
//	Product b;
}
class ElectroMart extends Mart {
	ElectroMart(){
		item1 = new TV();
		item2 = new Ref();
	}
}//가전 매장
class FruitMart extends Mart {
	FruitMart(){
		item1 = new Strawberry();
		item2 = new Banana();
	}
}//과일 매장
abstract class Product {
	int price;
	//추상 클래스는 생성자가 필요 없다. 인스턴스 하지 않기 때문에!
}
class TV extends Product {
	TV(){ price = 200000; }
}
class Ref extends Product {
	Ref(){ price = 300000; }
}

class Strawberry extends Product {
	Strawberry(){ price = 10000; }
}//딸기
class Banana extends Product {
	Banana(){ price = 5000; }
}//바나나
class Suzuki {
	Suzuki(){ pocketMoney = 1000000; }
	int pocketMoney;
	void buy(Product p) {
		pocketMoney -= p.price;
	}
//	void buy(TV p) {
//		//pocketMoney = pocketMoney - p.price;
//		pocketMoney -= p.price;
//	}
//	void buy(Ref p) {
//		//pocketMoney = pocketMoney - p.price;
//		pocketMoney -= p.price;
//	}
//	void buy(Strawberry p) {
//		//pocketMoney = pocketMoney - p.price;
//		pocketMoney -= p.price;
//	}
//	void buy(Banana p) {
//		//pocketMoney = pocketMoney - p.price;
//		pocketMoney -= p.price;
//	}
}//스즈키 군

//가전 매장에 TV와 냉장고가 있습니다. 가격이 있습니다.
//과일 매장에 딸기와 바나나가 있습니다. 가격이 있습니다.
//스즈끼 군이 있습니다. 백만 원을 가지고 있습니다.
//스즈끼 군이 자바 백화점에서 TV와 냉장고와 딸기와 바나나를 샀습니다.
//--> 스즈끼 군이 TV를 샀습니다.
//--> 스즈끼 군이 냉장고를 샀습니다.
//--> 스즈끼 군이 딸기를 샀습니다.
//--> 스즈끼 군이 바나나를 샀습니다.
//스즈끼 군의 남은 용돈을 출력합니다.



@WebServlet("/Aug22Study")
public class Aug22Study extends HttpServlet {
	final int a = 200; //상수 , 값을 바꿀 수 없다.
	int b = 200;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		b = 300;
		
		JavaDepartmentStore jds = new JavaDepartmentStore();
		Suzuki suzuki = new Suzuki();
		System.out.println("구매 전 스즈키의 용돈: "+suzuki.pocketMoney);
		suzuki.buy(jds.em.item1);//TV 구매
		suzuki.buy(jds.em.item2);//냉장고 구매
		suzuki.buy(jds.fm.item1);//딸기 구매
		suzuki.buy(jds.fm.item2);//바나나 구매
		System.out.println("구매 후 스즈키의 용돈: "+suzuki.pocketMoney);
	}
	private static final long serialVersionUID = 1L;

    public Aug22Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
