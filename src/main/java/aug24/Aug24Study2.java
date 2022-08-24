package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//악어와 개를 설계합니다. 고양이를 설계합니다.
//새로운 문제 : 모형 오리와 모형 말을 설계합니다.
class Animal {
	Eatable eatable; Seeable seeable; Sleepable sleepable;
	void eat() { eatable.eat();}
	void see() {seeable.see();}
	void sleep() {sleepable.sleep();}
}
//진짜 동물과 가짜 동물의 차이점 --> 인터페이스
interface Eatable {//변경 가능하도록 행위를 분리
	void eat();
}
interface Seeable {//변경 가능하도록 행위를 분리
	void see();
}
interface Sleepable {
	void sleep();
}
class RealMouth implements Eatable {
	public void eat() {
		System.out.println("입으로 먹는다");
	}
}
class FakeMouth implements Eatable {
	public void eat() {
		System.out.println("먹지 못한다.");
	}
}
class RealEye implements Seeable {
	public void see() {
			System.out.println("눈으로 본다.");
	}
}
class FakeEye implements Seeable {
	public void see() {
		System.out.println("보지 못한다..");
	}
}
class RealSleep implements Sleepable {
	public void sleep() {
		System.out.println("잔다.");
	}
}
class FakeSleep implements Sleepable {
	public void sleep() {
		System.out.println("못 잔다.");
	}
}
class Cat extends Animal {
	Cat(){
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}
}
class Allegator extends Animal {
	Allegator(){
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}
}
class HorseDoll extends Animal {
	HorseDoll(){
		eatable = new FakeMouth();
		seeable = new FakeEye();
		sleepable = new FakeSleep();
	}
}
class DuckDoll extends Animal {
	DuckDoll(){
		eatable = new FakeMouth();
		seeable = new FakeEye();
		sleepable = new FakeSleep();
	}
}
class Dog extends Animal {
	Dog(){
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}
}


@WebServlet("/Aug24Study2")
public class Aug24Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Allegator a = new Allegator();
		a.eat();
		a.see();
		a.sleep();
		Dog d = new Dog();
		d.eat();
		d.see();
		d.sleep();
		Cat c = new Cat();
		c.eat();
		c.see();
		c.sleep();
		DuckDoll dd = new DuckDoll();
		dd.eat();dd.see(); dd.sleep();
		HorseDoll hd = new HorseDoll();
		hd.eat(); hd.see(); hd.sleep();
	}
	private static final long serialVersionUID = 1L;
    public Aug24Study2() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
