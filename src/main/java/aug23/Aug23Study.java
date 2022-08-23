package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Tiger {
	Tiger(){}
	int age = 10;
	void doIt() {
		System.out.println("Tiger");
	}
}
class Lion {
	Lion(){}
	static int age = 10;
	static void doIt() {
		System.out.println("Lion");
	}
}
interface Fish {
	int SPEED = 50; //���
	void swim();//�߻� �޼���
}
interface Bird {
	static final int SPEED = 100;//���
	public abstract void fly(); //�߻� �޼���
	//����ؼ� �������̵� �ؾ� �ϹǷ� public(����)���θ� ����
	
	//�ڹٿ��� ���п� �ܰ�(4�ܰ�)
	//1. ���� ����(������ �� �Ѵ�) : public
	//-> ���� �ٸ� ��Ű�������� ������ �� �ִ�.
	//2. ���� ��Ű�� �ȿ����� ���� : �ƹ��͵� �� ����.(�⺻) default
	//-> 
	//3. �ڽĿ��Ը� ���� : protected
	//4. ���� ����(���� Ŭ���� �ȿ����� ����) : private
	//			Ŭ�������� public�� �⺻�� �ȴ�
	//			public class A {} ����
	//			class B {} ����
	//			protected class C {} Ŭ������ ���� //����, �޼��常 ����
	//			private class D {} Ŭ������ ����  //����, �޼��常 ����
}
interface Animal extends Bird, Fish {
	
}
class Somebody implements Bird, Fish {
	@Override
	public void swim() {

	}
	@Override
	public void fly() {

	}
}
class Cat {
	Cat(){}
	final int SPEED = 100;
}
@WebServlet("/Aug23Study")
public class Aug23Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int y = Bird.SPEED;
		Cat c1 = new Cat();
		int x = c1.SPEED;
		
		Tiger t = new Tiger();//�ν��Ͻ� ����(ȫ�浿)
		int a = t.age;
		t.doIt();
		Tiger t2 = new Tiger();//�ν��Ͻ� ����(�ڱ浿)
		t2.doIt();
		Tiger t3 = new Tiger();//�ν��Ͻ� ����(�ֱ浿)
		t3.doIt();
		
		int b = Lion.age;
		Lion.doIt();
	}
	private static final long serialVersionUID = 1L;

    public Aug23Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
