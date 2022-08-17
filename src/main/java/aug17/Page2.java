package aug17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class IamParents {
	IamParents(){}
	int money = 200;
	void callMe() {
		System.out.println("���� �ƹ�����.");
	}
}
class IamChild extends IamParents {
	IamChild(){}
	int money = 100;
	void show() {
		System.out.println(this.money+","+super.money);
	}
//	void callMe() {
//		System.out.println("���� �ڽ��̴�.");
//	}
	@Override
	void callMe() {
		System.out.println("���� �ڽ��̴�");
	}
}
class Tiger {
	Tiger(){}
}
class Cat extends Tiger {
	Cat(){}
}
class Dog extends Tiger {
	Dog(){}
}
@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Page2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tiger t = new Tiger();
		Tiger f = new Cat(); //������(polymorphism)
		Tiger d = new Dog(); //������(polymorphism)
		IamChild c = new IamChild();
		c.show();
		c.callMe();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
