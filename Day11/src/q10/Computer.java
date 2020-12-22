package q10;

public class Computer {
	public static final String[] osType = {"원도7", "애플 OS X", "안드로이드"};
	int num;
	int memory;
	
	
	public Computer(int num,int memory) {
		this.num=num;
		this.memory=memory;
	}
	public void print() {
		System.out.println("운영체제: "+osType[num]+", 메인메모리: "+memory);
	}
	
	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2, 16);
        pc.print();
        apple.print();
        galaxy.print();

	}

}
