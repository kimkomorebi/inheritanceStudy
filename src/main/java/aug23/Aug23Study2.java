package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�䰡���� ��ü ����(������ �ִ� �� : ���� Ư¡�� ���� Ư¡�� ��� ����)
//���� Ư¡�� ���� Ư¡�� ���� �������̽��� ����
interface Birdd {
	void fly(); // ���� ���ٴ� �޼��� (�߻�޼���)
}//���� Ư¡�� ���� ��ü
class Sparrow implements Birdd {
	@Override
	public void fly() {
		System.out.println("������ ������ �����̸� ����.");
	}
}
class Eagle implements Birdd {
	@Override
	public void fly() {
		System.out.println("õõ�� ���ְ� ����.");
	}
	
}
interface Horse {
	void run();//���� �پ�ٴϴ� �޼���(�߻�޼���)
}//���� Ư¡�� ���� ��ü

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
