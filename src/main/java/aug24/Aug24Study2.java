package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�Ǿ�� ���� �����մϴ�. ����̸� �����մϴ�.
//���ο� ���� : ���� ������ ���� ���� �����մϴ�.
class Animal {
	Eatable eatable; Seeable seeable; Sleepable sleepable;
	void eat() { eatable.eat();}
	void see() {seeable.see();}
	void sleep() {sleepable.sleep();}
}
//��¥ ������ ��¥ ������ ������ --> �������̽�
interface Eatable {//���� �����ϵ��� ������ �и�
	void eat();
}
interface Seeable {//���� �����ϵ��� ������ �и�
	void see();
}
interface Sleepable {
	void sleep();
}
class RealMouth implements Eatable {
	public void eat() {
		System.out.println("������ �Դ´�");
	}
}
class FakeMouth implements Eatable {
	public void eat() {
		System.out.println("���� ���Ѵ�.");
	}
}
class RealEye implements Seeable {
	public void see() {
			System.out.println("������ ����.");
	}
}
class FakeEye implements Seeable {
	public void see() {
		System.out.println("���� ���Ѵ�..");
	}
}
class RealSleep implements Sleepable {
	public void sleep() {
		System.out.println("�ܴ�.");
	}
}
class FakeSleep implements Sleepable {
	public void sleep() {
		System.out.println("�� �ܴ�.");
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
