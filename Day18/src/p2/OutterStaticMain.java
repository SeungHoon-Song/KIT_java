package p2;

public class OutterStaticMain {

	public static void main(String[] args) {
		//1단계 외부와 상관없이 객체화 시킬 수 있다,
		OutterStatic.InnerStatic ois = new OutterStatic.InnerStatic();
		ois.iia=300;
		ois.iiaMethod();
		ois.iisa=100;
		ois.iisaMethod();
		//또는
		OutterStatic.InnerStatic.iisa=200;
		OutterStatic.InnerStatic.iisaMethod();
	}

}
