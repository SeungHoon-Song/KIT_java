package sec04.exam02;

public class UsingLocalVariable {
	void method(int arg) {
		final int localVar = 40;
		
		//arg=31; 암시적으로 final이라서
		//localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+arg);
			System.out.println("localVar: "+localVar);
		};
		fi.method();
	}
}
