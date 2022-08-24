package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//게임에 등장하는 영웅(왕, 기사, 마법사)
//왕(King : 사용하는 무기 Axe)
abstract class Hero {
	Weapon w;
	void fight() {whoAmI(); w.use();};
	abstract void whoAmI();
}
class King extends Hero {
	King(){ w = new Axe(); }
//	void fight() {
//		whoAmI();
//		w.use();
//	}
	void whoAmI() {
		System.out.println("나는 왕이다.");
	}
}
class Queen extends Hero {
	Queen() { w = new Bow(); }
//	void fight() {
//		whoAmI(); w.use();
//	}
	void whoAmI() { System.out.println("나는 왕비다.");	}
}
//기사(Knight : 사용하는 무기 Sword)
class Knight extends Hero {
	Knight() { w = new Sword(); }
	void whoAmI() {
		System.out.println("나는 기사다.");
	}
//	void fight() {
//		whoAmI();
//		w.use();
//	}
}
//마법사(Magician : 사용하는 무기 Spear)
class Magician extends Hero {
	Magician(){ w = new Spear(); }
	void whoAmI() {
		System.out.println("나는 마법사다.");
	}
//	void fight() {
//		whoAmI();
//		w.use();
//	}
}
//영웅이 사용하는 무기(도끼(Axe),칼(Sword), 창(Spear))
interface Weapon {
	void use();
}
class Bow implements Weapon {
	public void use() { System.out.println("활을 사용"); }
}
class Axe implements Weapon {
	Axe(){  }
	public void use() { System.out.println("도끼를 사용"); }
}
class Sword implements Weapon {
	Sword(){  }
	public void use() { System.out.println("칼을 사용"); }
}
class Spear implements Weapon {
	Spear(){  }
	public void use() { System.out.println("창을 사용"); }
}
@WebServlet("/Aug24Study")
public class Aug24Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		King king = new King();
		king.fight();
		Knight knight = new Knight();
		knight.fight();
		Magician magician = new Magician();
		magician.fight();
	}
	private static final long serialVersionUID = 1L;

    public Aug24Study() {
        super();

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
