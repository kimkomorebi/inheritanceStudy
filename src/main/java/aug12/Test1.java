package aug12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Goguryo {
	Goguryo(){};
	int gold = 100;
	void goguryoPlay() {
		System.out.println("���� �μӳ���");
	}
}
class Shilla extends Goguryo{
	Shilla(){}//������
	int coal = 100;
	void shillaPlay() {
		System.out.println("�Ŷ� �μӳ���");
	}
}
class Chosun extends Shilla {
	Chosun(){}
	int silver = 200;
	void chosunPlay() {
		System.out.println("���� �μӳ���");
	}
}
class Korea extends Chosun {
	Korea(){}
}
class GrandParents {
	GrandParents(){}
	int money = 5000;
}
class Parents extends GrandParents {
	Parents(){}
	int money = 1000;
	void show() {
		System.out.println(this.money+","+super.money);
	}
}
class Child extends Parents {
	Child(){}
	int money = 50;

	void display() {
		System.out.println(this.money+","+super.money);//this ������ super ������
	}
}
@WebServlet("/Test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Child c = new Child();
		//System.out.println(c.money);
		c.display();
		c.show();
//		Korea k = new Korea();
//		System.out.println(k.gold);
//		System.out.println(k.coal);
//		System.out.println(k.silver);
//		k.goguryoPlay();
//		k.shillaPlay();
//		k.chosunPlay();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
