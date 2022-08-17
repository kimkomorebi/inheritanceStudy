package aug17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class IamKing {
	String name;
	IamKing(String name){
		this.name = name;
	}
}
class IamSon extends IamKing {
	IamSon(){
		super("È«±æµ¿");// ----> IamKing("È«±æµ¿");
	}
}
class One {
	int i;
	String name;
	One(int i) {
		this.i = i;
	}
	One(String name) {
		this.name = name;
	}
}
class Two extends One {
	Two(int i) {
		super(i);
	}
	Two(String name){
		super(name);
	}
}

class Hana {
	int i;
	int j;
	double k;
	Hana(int i, int j) {
		this.i = i;
		this.j = j;
	}
	Hana(double k) {
		this.k = k;
	}
}
class Dool extends Hana {
	Dool(int i, int j){
		super(i, j);
	}
	Dool(double k){
		super(k);
	}
}
class Seet extends Dool {
	Seet(int i, int j){
		super(i, j);
	}
	Seet(double k){
		super(k);
	}
}

@WebServlet("/Page6")
public class Page6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Page6() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Seet seet1 = new Seet(10, 11);
		Seet seet2 = new Seet(3.14);
		Dool dool1 = new Dool(1,5);
		Dool dool2 = new Dool(5.5);
		Two tw1 = new Two(5);
		Two tw2 = new Two("±è±æµ¿");
		IamSon s1 = new IamSon();
		IamKing k1 = new IamKing("¾È³ç");
		IamKing k2 = new IamKing("korea");
		IamKing k3 = new IamKing("È«±æµ¿");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
