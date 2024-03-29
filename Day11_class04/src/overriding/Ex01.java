package overriding;

class Ferrari {
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km로 달립니다");
	}
	public void onCar() {
		System.out.println("자동차 시동을 켭니다!");
	}
}

class NewFerrari extends Ferrari{

	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전모드를 실행합니다!");
	}
	public void speed() {
		System.out.println(getYe() + "년식 페라리 속도 변경");
		System.out.println("500km까지 달릴 수 있습니다"); //overriding
	}
}

public class Ex01 {
	public static void main(String[] args) {
		NewFerrari f  = new NewFerrari(2025);
		f.onCar();
		f.speed();
		f.autoSystem();
	}

}
