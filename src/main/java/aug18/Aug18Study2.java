package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//TV, ��ǻ��, ����� �ֽ��ϴ�. ����(�ʸ�, ��ʸ�, �̽ʸ�)�� �ֽ��ϴ�.
//����Ű�� �뵷�� �鸸�� ������ �ֽ��ϴ�.
//����Ű�� �뵷���� TV, ��ǻ��, ����� �����߽��ϴ�.
//����(�޼ҵ�) : ����Ű�� �뵷 - TV�� ����
//����(�޼ҵ�) : ����Ű�� �뵷 - ��ǻ���� ����
//����(�޼ҵ�) : ����Ű�� �뵷 - ������� ����
//����Ű�� �뵷 �ܾ��� ����մϴ�.

class Suzuki {
	void buy(Item a) {
		pocketMoney = pocketMoney - a.price;
	}
//	void buy(TV a) {//TV�� �����ϴ� �޼ҵ�
//		pocketMoney = pocketMoney - a.price;
//	}
//	void buy(Computer b) {
//		pocketMoney = pocketMoney - b.price;
//	}//��ǻ�͸� �����ϴ� �޼ҵ�
//	void buy(Ref c) {
//		pocketMoney = pocketMoney - c.price;
//	}//����� �����ϴ� �޼ҵ�
	
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
		System.out.println("�����ϱ� �� ����Ű�� �뵷:"+su.pocketMoney);
		su.buy(tv);//TV�� ������
		su.buy(com);//��ǻ�͸� ������
		su.buy(rf);//����� ������
//		���� su.buy();  tv,com,rf ���� �ȿ� �� Ŭ������ ����ְ� 
//		buy �޼����� �Ű����� ������Ÿ������ item�� �ۼ��Ͽ�
//		price ������ ����
//		Item a = new TV();
//		a = new Computer();
//		a = new Ref();
		
		System.out.println("TV�� ����:"+tv.price);
		System.out.println("��ǻ���� ����:"+com.price);
		System.out.println("������� ����:"+rf.price);
		System.out.println("����Ű�� �뵷:"+su.pocketMoney);
		
	}
	private static final long serialVersionUID = 1L;

    public Aug18Study2() {
        super();

    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
