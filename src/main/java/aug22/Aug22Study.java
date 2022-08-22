package aug22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�ڹ� ��ȭ���� �ֽ��ϴ�. �� ��ȭ���� ���� ����� ���� ������ �ֽ��ϴ�.
class JavaDepartmentStore {
	JavaDepartmentStore(){
		em = new ElectroMart();
		 fm = new FruitMart();
	}
	Mart em;
	Mart fm;
}//�ڹ� ��ȭ��
abstract class Mart {
	//�߻� Ŭ������ �����ڰ� �ʿ� ����. �ν��Ͻ� ���� �ʱ� ������!
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
}//���� ����
class FruitMart extends Mart {
	FruitMart(){
		item1 = new Strawberry();
		item2 = new Banana();
	}
}//���� ����
abstract class Product {
	int price;
	//�߻� Ŭ������ �����ڰ� �ʿ� ����. �ν��Ͻ� ���� �ʱ� ������!
}
class TV extends Product {
	TV(){ price = 200000; }
}
class Ref extends Product {
	Ref(){ price = 300000; }
}

class Strawberry extends Product {
	Strawberry(){ price = 10000; }
}//����
class Banana extends Product {
	Banana(){ price = 5000; }
}//�ٳ���
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
}//����Ű ��

//���� ���忡 TV�� ����� �ֽ��ϴ�. ������ �ֽ��ϴ�.
//���� ���忡 ����� �ٳ����� �ֽ��ϴ�. ������ �ֽ��ϴ�.
//��� ���� �ֽ��ϴ�. �鸸 ���� ������ �ֽ��ϴ�.
//��� ���� �ڹ� ��ȭ������ TV�� ������ ����� �ٳ����� ����ϴ�.
//--> ��� ���� TV�� ����ϴ�.
//--> ��� ���� ����� ����ϴ�.
//--> ��� ���� ���⸦ ����ϴ�.
//--> ��� ���� �ٳ����� ����ϴ�.
//��� ���� ���� �뵷�� ����մϴ�.



@WebServlet("/Aug22Study")
public class Aug22Study extends HttpServlet {
	final int a = 200; //��� , ���� �ٲ� �� ����.
	int b = 200;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		b = 300;
		
		JavaDepartmentStore jds = new JavaDepartmentStore();
		Suzuki suzuki = new Suzuki();
		System.out.println("���� �� ����Ű�� �뵷: "+suzuki.pocketMoney);
		suzuki.buy(jds.em.item1);//TV ����
		suzuki.buy(jds.em.item2);//����� ����
		suzuki.buy(jds.fm.item1);//���� ����
		suzuki.buy(jds.fm.item2);//�ٳ��� ����
		System.out.println("���� �� ����Ű�� �뵷: "+suzuki.pocketMoney);
	}
	private static final long serialVersionUID = 1L;

    public Aug22Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
