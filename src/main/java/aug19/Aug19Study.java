package aug19;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//머린, 질럿, 히드라가 있습니다. 마나가 100입니다. 왜 저글링이 아니죠..?
//전투를 하면 마나가 1씩 줄어듭니다.
//메딕이 모든 공격 유닛을 치료합니다.
//치료를 받은 유닛의 마나가 100이 됩니다.
class Medic {
	Medic(){}
	void recover(Unit u) {
		u.mana = 100;
	}
//	//머린을 치료하면, 머린의 마나가 100
//	void recover(Marine u) {
//		u.mana = 100;
//	}
//	//히드라를 치료하면, 히드라의 마나가 100
//	void recover(Hydra u) {
//		u.mana = 100;
//	}
//	//질럿을 치료하면, 질럿의 마나가 100
//	void recover(Zilet u) {
//		u.mana = 100;
//	}
}
class Unit {
	int mana = 100;
	void attack(Unit u) {
		u.mana = u.mana - 1;
	}
//	void attack(Hydra enemy) {
//		enemy.mana = enemy.mana - 1;
//	}//상대방 히드라를 공격하는 메서드
//	void attack(Marine enemy) {
//		enemy.mana = enemy.mana -1;
//	}//상대방 머린을 공격하는 메서드
//	void attack(Zilet enemy) {
//		enemy.mana = enemy.mana -1;
//	}//상대방 질럿을 공격하는 메서드
}

class Hydra extends Unit {
	Hydra(){}
}
class Zilet extends Unit {
	Zilet(){}
}
class Marine extends Unit {
	Marine(){}
}

@WebServlet("/Aug19Study")
public class Aug19Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Marine m1 = new Marine();
		Hydra h1 = new Hydra();
		Zilet z1 = new Zilet();
		m1.attack(h1);//머린이 히드라 공격
		m1.attack(h1);
		z1.attack(h1);//질럿이 히드라 공격
		h1.attack(m1);//히드라가 머린 공격
		h1.attack(z1);//히드라가 질럿 공격
		//머린의 마나 : 99, 히드라의 마나 : 97, 질럿의 마나 : 99
		System.out.println("머린의 마나:"+m1.mana);
		System.out.println("히드라의 마나:"+h1.mana);
		System.out.println("질럿의 마나:"+z1.mana);
		Medic m = new Medic();
		m.recover(h1);//히드라를 치료
		m.recover(m1);//머린을 치료
		m.recover(z1);//질럿을 치료
		System.out.println("머린의 마나:"+m1.mana);
		System.out.println("히드라의 마나:"+h1.mana);
		System.out.println("질럿의 마나:"+z1.mana);
	}
	private static final long serialVersionUID = 1L;

    public Aug19Study() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
