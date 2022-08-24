package aug22;

public interface A extends B, C {
	int HANA = 1;
	void sing();
}
interface B {
	
}
interface C {}
class Hong implements A, B, C {
	void doIt() {
		int a = A.HANA;
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
}